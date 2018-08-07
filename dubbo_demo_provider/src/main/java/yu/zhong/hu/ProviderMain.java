/**   
  * @project    : dubbo_demo_provider
  * @copyright  : (c) 2012-2015 WASU Media & Network Co,Ltd.
  * @package    : yu.zhong.hu
  * @created on : 2018年8月6日 下午1:47:27
  * @author     : 紫衣侠隐
  */
package yu.zhong.hu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@fileName   : ProviderMain.java
 *@description: Provider entrance
 *@author     : 紫衣侠隐
 */
public class ProviderMain {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }

}
