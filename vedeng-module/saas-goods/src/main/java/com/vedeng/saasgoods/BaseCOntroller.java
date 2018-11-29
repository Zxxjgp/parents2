package com.vedeng.saasgoods;

import com.vedeng.utils.DataUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 * className
 *
 * @author Bert
 * @date 2018/11/29 11:02
 * @Description //TODO
 * @version: 1.0
 */
@RestController
public class BaseCOntroller {
	
	@RequestMapping("test")
	public String getList(){
		String string = DataUtils.getString();
		System.out.println(string);
		return "ok"+string;
	}
}
