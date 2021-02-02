package cn.itrus.devops.service;

import org.springframework.stereotype.Service;

/** 
* @ClassName: MainService 
* @Description: TODO
* @author: 大国哥
* @date: 2021年2月2日 下午4:15:44 
*/
@Service
public class MainService {

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		
		return a + b;
	}

}
