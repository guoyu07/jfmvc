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
package com.hyts.jfmvc.boot;

import com.hyts.jfmvc.core.JfmvcHandler;

/**  
 * @Title JfmvcModelBuilder.java  
 * @Package com.hyts.jfmvc.boot  
 * @Description 处理模型映射构造器服务
 * @author LiBo/Alex  
 * @date 2017年10月31日  
 * @version V1.0  
 */
final class JfmvcModelBuilder {

	
	 public static void deal()
	 {
		 JfmvcHandler.getGlobalInstance().getJfmvcModels();
	 }
	
	
	
}
