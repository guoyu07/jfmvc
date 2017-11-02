/* 
 * Copyright [2017] [Alex/LiBo(libo2dev.aliyun.com/alex.link@foxmail.com)]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hyts.jfmvc.bind;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**  
 * @Title BindInterceptor.java  
 * @Package com.hyts.jfmvc.jfinal  
 * @Description Jfinal框架总体核心基础拦截器 
 * @author LiBo/Alex  
 * @date 2017年10月26日  
 * @version V1.0  
 */
public class BindServiceInterceptor implements Interceptor {

	/* (非 Javadoc)  
	 * <p>Title: intercept</p>  
	 * <p>Description: </p>  
	 * @param inv  
	 * @see com.jfinal.aop.Interceptor#intercept(com.jfinal.aop.Invocation)  
	 */
	@Override
	public void intercept(Invocation inv) {
		//获取controller层次类
		Class<?> controllerClazz = null;
		//最后执行以及操作执行
		inv.invoke();
	}

}
