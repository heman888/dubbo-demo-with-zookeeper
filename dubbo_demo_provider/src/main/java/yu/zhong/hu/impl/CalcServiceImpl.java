/**   
  * @project    : dubbo_demo_provider
  * @copyright  : (c) 2012-2015 WASU Media & Network Co,Ltd.
  * @package    : yu.zhong.hu.impl
  * @created on : 2018年8月3日 下午5:50:38
  * @author     : 紫衣侠隐
  */
package yu.zhong.hu.impl;

import yu.zhong.hu.ICalcService;

/**
 *@fileName   : CalcServiceImpl.java
 *@description: TODO
 *@author     : 紫衣侠隐
 */
public class CalcServiceImpl implements ICalcService {

	/* (non-Javadoc)
	 * @see yu.zhong.hu.ICalcService#add(int, int)
	 */
	@Override
	public int add(int i, int j) {
		return i + j;
	}

	/* (non-Javadoc)
	 * @see yu.zhong.hu.ICalcService#about(java.lang.String)
	 */
	@Override
	public String about(String s) {
		return String.format("about:param=%s", s);
	}

}
