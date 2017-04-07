/* Copyright 2013-2015 www.snakerflow.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine;

import org.snaker.engine.core.Execution;

/**
 * 结束节点拦截器，在执行结束节点时进行拦截处理。
 * @author yuqs
 * @since 1.2
 */
public interface EndNodeInterceptor {	
	/**
	 * 前置拦截方法，参数为执行对象。<br/>
	 * 注意：如果配置了节点的SnakerInterceptor前置拦截器，则先执行前置拦截器，再执行此beforeIntercept方法。
	 * @param execution 执行对象。可从中获取执行的数据
	 */
	public void beforeIntercept(Execution execution);
	/**
	 * 后置拦截方法，参数为执行对象<br/>
	 * 注意：如果配置了节点的SnakerInterceptor后置拦截器，则先执行此afterIntercept方法，再执行前置拦截器。
	 * @param execution 执行对象。可从中获取执行的数据
	 */
	public void afterIntercept(Execution execution);
}
