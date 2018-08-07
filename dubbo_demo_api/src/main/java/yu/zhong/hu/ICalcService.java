/**   
  * @project    : dubbo_demo_api
  * @copyright  : (c) 2012-2015 WASU Media & Network Co,Ltd.
  * @package    : yu.zhong.hu
  * @created on : 2018年8月3日 下午5:47:15
  * @author     : 紫衣侠隐
  */
package yu.zhong.hu;

/**
 *@fileName   : ICalcService.java
 *@description: 计算服务
 *@author     : 紫衣侠隐
 */
public interface ICalcService {
	/**
	 * add method
	  * @param i
	  * @param j
	  * @return
	  * @author     : 紫衣侠隐
	 */
	int add(int i, int j);
	/**
	 * about method
	  * @param s
	  * @return
	  * @author     : 紫衣侠隐
	 */
	String about(final String s);
}
