package org.snaker.engine.cache.codis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snaker.engine.cache.Cache;
import org.snaker.engine.cache.CacheException;
import org.snaker.engine.cache.CacheManager;

import cn.gdeng.market.redis.support.JodisTemplate;

public class CodisManager implements CacheManager {

	private static final Logger log = LoggerFactory.getLogger(CodisManager.class);
	

	protected JodisTemplate cache;
	
	/**
	 * 默认过期时间为1天。1天 =24*60*60 = 86400 秒。
	 */
	private static final int DEFAULT_EXPIRED_TIME = 86400;
	/**缓存过期时间。单位：秒。
	 * 
	 */
	private int expiredTime = DEFAULT_EXPIRED_TIME;

	public <K, V> Cache<K, V> getCache(String name) throws CacheException {
		try {
			log.debug("getting CodisCache, the cache name is :" + name);
			return new CodisCache<K, V>(cache, name, expiredTime);
		} catch (Exception e) {
			throw new CacheException(e);
		}
	}

	public void destroy() throws CacheException {
		log.warn("current CodisManager is unsupported destroy.");
	}

	public JodisTemplate getCache() {
		return cache;
	}

	public void setCache(JodisTemplate cache) {
		this.cache = cache;
	}

	public int getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(int expiredTime) {
		this.expiredTime = expiredTime;
	}
}
