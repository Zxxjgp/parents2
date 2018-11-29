package com.vedeng.sale;

import com.vedeng.utils.DataUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 * className
 *
 * @author Bert
 * @date 2018/11/29 9:54
 * @Description //TODO 基础类、
 * @version: 1.0
 */
@RestController
@RequestMapping("api/test")
public class BaseController {
	
	@RequestMapping("test")
	public String getString(){
		System.out.println(DataUtils.getString());
		return "ok";
	}
}
