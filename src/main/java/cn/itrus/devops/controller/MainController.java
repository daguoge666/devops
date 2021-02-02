package cn.itrus.devops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itrus.devops.service.MainService;

/** 
* @ClassName: MainController 
* @Description: TODO
* @author: 大国哥
* @date: 2021年2月2日 下午4:13:30 
*/
@RestController
public class MainController {
	
	@Autowired
	MainService mainSrv;
	
	@GetMapping("/add")
	public int add(int a,int b) {
		return mainSrv.add(a,b);
	}
	
}
