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
package org.snaker.engine.model;

import java.util.Collections;
import java.util.List;

import org.snaker.engine.StartNodeInterceptor;
import org.snaker.engine.core.Execution;
import org.snaker.engine.core.ServiceContext;

/**
 * 开始节点定义start元素
 * @author yuqs
 * @since 1.0
 */
public class StartModel extends NodeModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4550530562581330477L;

	/**
	 * 开始节点无输入变迁
	 */
	public List<TransitionModel> getInputs() {
		return Collections.emptyList();
	}

	protected void exec(Execution execution) {
		StartNodeInterceptor interceptor = ServiceContext.find(StartNodeInterceptor.class);
		//前置拦截
		if (interceptor != null) {
			interceptor.beforeIntercept(execution);
		}
		//实际业务处理。
		runOutTransition(execution);
		//后置拦截
		if (interceptor != null) {
			interceptor.afterIntercept(execution);
		}
	}
}
