package com.entity.model;

import com.entity.ZuoyeleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 作业类型
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-11 13:13:47
 */
public class ZuoyeleixingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作业类型
	 */
	
	private String zuoyeleixing;
				
	
	/**
	 * 设置：作业类型
	 */
	 
	public void setZuoyeleixing(String zuoyeleixing) {
		this.zuoyeleixing = zuoyeleixing;
	}
	
	/**
	 * 获取：作业类型
	 */
	public String getZuoyeleixing() {
		return zuoyeleixing;
	}
			
}
