package com.entity.view;

import com.entity.ZuoyeleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-11 13:13:47
 */
@TableName("zuoyeleixing")
public class ZuoyeleixingView  extends ZuoyeleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyeleixingView(){
	}
 
 	public ZuoyeleixingView(ZuoyeleixingEntity zuoyeleixingEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyeleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
