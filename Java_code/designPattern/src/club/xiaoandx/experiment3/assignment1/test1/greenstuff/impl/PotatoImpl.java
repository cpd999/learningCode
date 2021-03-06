/*
 * Copyright (c) 2021 WEI.ZHOU. All rights reserved.
 * The following code is only used for learning and communication, not for illegal and 
 * commercial use.
 * If the code is used, no consent is required, but the author has nothing to do with any problems
 * and consequences.
 * In case of code problems, feedback can be made through the following email address.
 * 
 *                        <xiaoandx@gmail.com>
 */
package club.xiaoandx.experiment3.assignment1.test1.greenstuff.impl;

import club.xiaoandx.experiment3.assignment1.test1.greenstuff.Greenstuff;

/**  
 * <p> 土豆  </p> 
 *	1.实现根菜蔬菜接口
 *	2.实现根菜蔬菜中的具体方法
 * @ClassName:PotatoImpl   
 * @author: WEI.ZHOU
 * @date: 2021-04-01 16:35
 * @since: JDK1.8
 * @version V1.0.0
 */
public class PotatoImpl implements Greenstuff {

	/**   
	 * <p> 豆类播种  </p></br>
	 * <p>Title: sowing</p> 
	 * @date: 2021-04-01 16:35       
	 * @see club.xiaoandx.experiment3.assignment1.test1.greenstuff.Greenstuff#sowing()   
	 */
	@Override
	public void sowing() {
		System.out.println("正在播种土豆");
	}

	/**   
	 * <p> 成长 </p></br>
	 * <p>Title: growUp</p> 
	 * @date: 2021-04-01 16:35       
	 * @see club.xiaoandx.experiment3.assignment1.test1.greenstuff.Greenstuff#growUp()   
	 */
	@Override
	public void growUp() {
		System.out.println("土豆，豆类正在成长");
	}

	/**   
	 * <p> 果实 </p></br>
	 * <p>Title: fruit</p> 
	 * @date: 2021-04-01 16:35       
	 * @see club.xiaoandx.experiment3.assignment1.test1.greenstuff.Greenstuff#fruit()   
	 */
	@Override
	public void fruit() {
		System.out.println("成长完成都到土豆");
	}

}
