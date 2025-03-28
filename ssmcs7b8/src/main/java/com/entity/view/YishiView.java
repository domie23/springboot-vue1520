package com.entity.view;

import com.entity.YishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
@TableName("yishi")
public class YishiView  extends YishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YishiView(){
	}
 
 	public YishiView(YishiEntity yishiEntity){
 	try {
			BeanUtils.copyProperties(this, yishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
