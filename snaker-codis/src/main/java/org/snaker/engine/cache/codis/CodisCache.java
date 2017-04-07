package org.snaker.engine.cache.codis;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snaker.engine.cache.Cache;
import org.snaker.engine.cache.CacheException;
import org.snaker.engine.helper.AssertHelper;

import cn.gdeng.market.redis.support.JodisTemplate;
import cn.gdeng.market.util.SerializeUtil;


public class CodisCache<K, V> implements Cache<K, V> {
	private static final Logger log = LoggerFactory.getLogger(CodisCache.class);
	
	private JodisTemplate cache;
	
	private String name;
	
	/**缓存过期时间。单位：秒。
	 * 
	 */
	private final int expiredTime;
	
	public CodisCache(JodisTemplate cache,String name, int expiredTime) {
		AssertHelper.notNull(cache);
		this.cache = cache;
		this.name = name;
		this.expiredTime = expiredTime;
	}
	
	@SuppressWarnings("unchecked")
	public V get(K key) throws CacheException {
		if(key == null) return null;
		
		log.debug("get in cache ,the key is " + key);
		
        try {
            Map<K,V> map = (Map<K,V>)cache.getObject(name.getBytes("utf-8"));
            if (map == null) {
                return null;
            } else {
                return (V) map.get(key);
            }
        } catch (Throwable t) {
            throw new CacheException(t);
        }
	}

	@SuppressWarnings("unchecked")
	public V put(K key, V value) throws CacheException {
		log.debug(String.format("put in cache ,the key is [%s], the value is [%s]", key, value));
		
		
        try {
        	Map<K,V> map = (Map<K,V>)cache.getObject(name.getBytes("utf-8"));
        	if(map != null && map.size() > 0){
        		map.put(key,value);
        		//添加过期时间，以防止数据在缓存中僵死。
        		cache.setex(name.getBytes("utf-8"), expiredTime, SerializeUtil.serialize(map));
        	}else{
        		map = new HashMap<K,V>();
        		map.put(key,value);
        		//添加过期时间，以防止数据在缓存中僵死。
        		cache.setex(name.getBytes("utf-8"), expiredTime, SerializeUtil.serialize(map));
        	}
            return value;
        } catch (Throwable t) {
            throw new CacheException(t);
        }
	}

	@SuppressWarnings("unchecked")
	public V remove(K key) throws CacheException {
		log.debug("remove in cache ,the key is " + key);
        try {
        	Map<K,V> map = (Map<K,V>)cache.getObject(name.getBytes("utf-8"));
        	V value = null;
        	if(map != null && map.size() > 0){
        		value = map.get(key);
        		map.remove(key);
        		cache.setex(name.getBytes("utf-8"), expiredTime, SerializeUtil.serialize(map));
        	}
            return value;
        } catch (Throwable t) {
            throw new CacheException(t);
        }
	}

	public void clear() throws CacheException {
		log.warn("current CodisCache is unsupported clear.");
	}
}
