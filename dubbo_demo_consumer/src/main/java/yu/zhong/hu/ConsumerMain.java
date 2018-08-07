/**   
  * @project    : dubbo_demo_consumer
  * @copyright  : (c) 2012-2015 WASU Media & Network Co,Ltd.
  * @package    : yu.zhong.hu
  * @created on : 2018年8月7日 下午8:04:35
  * @author     : 紫衣侠隐
  */
package yu.zhong.hu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@fileName   : ConsumerMain.java
 *@description: TODO
 *@author     : 紫衣侠隐
 */
public class ConsumerMain {

	/**
	  * @param args
	  * @author     : 紫衣侠隐
	  */
	public static void main(String[] args) {
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        ICalcService demoService = (ICalcService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.about("demo-service-from-consumer");
        // Display the call result
        System.out.println(hello);
        
        
        System.out.println("add-result="+demoService.add(99, 1));
	}

}
