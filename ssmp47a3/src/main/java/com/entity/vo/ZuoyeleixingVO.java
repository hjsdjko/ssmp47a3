package com.entity.vo;

import com.entity.ZuoyeleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 作业类型
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-11 13:13:47
 */
public class ZuoyeleixingVO  implements Serializable {
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
