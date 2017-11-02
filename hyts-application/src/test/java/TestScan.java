import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import com.hyts.app.ScanBootstrap;

import net.alex.scan.annotation.IncludeAnnotations;
import net.alex.scan.annotation.IncludePackages;
import net.alex.scan.error.ScanException;
import net.alex.scan.factory.ScannerFactory;
import net.alex.scan.model.ScanResultInvoke;
import net.alex.scan.scanner.Scanner;
import junit.framework.TestCase;

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

/**  
 * @Title TestScan.java  
 * @Package   
 * @Description TODO(用一句话描述该文件做什么)  
 * @author LiBo/Alex  
 * @date 2017年10月27日  
 * @version V1.0  
 */
public class TestScan extends TestCase{

	public void testMethod01()
	{
		Scanner scanner;
		try {
			scanner = ScannerFactory.getInstance().runWithAnnotation(ScanBootstrap.class)
					.createScanner();
			Object [] obj2 = 
					scanner.scan().toArray();
			for(Object obj :obj2)
			{
				ScanResultInvoke inv = (ScanResultInvoke)obj;
				try {
					System.out.println(inv.getAnnotation()+","+inv.getClassEntity());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
				} catch (IllegalArgumentException  e) {
					// TODO Auto-generated catch block runWithAnnotation(TestScanner.class).
					e.printStackTrace();
				} 
			}
		} catch (ScanException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
