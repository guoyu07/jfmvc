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
package com.hyts.jfmvc.conf;

import com.google.inject.Stage;

/**  
 * @Title GuiceAttrConf.java  
 * @Package com.hyts.jfmvc.conf  
 * @Description Guice依赖注入框架的参数基本静态配置类 
 * @author LiBo/Alex  
 * @date 2017年10月27日  
 * @version V1.0  
 */
public class GuiceAttrConf {
	
	
	/**  
	 * @Fields field:field:{todo}默认的Guice框架绑定subject对象的级别  
	 */ 
	public static final Stage DEFAULT_GUICE_BIND_SUBJECT_STAGE = Stage.DEVELOPMENT;
	

}
