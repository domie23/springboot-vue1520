package com.entity.vo;

import com.entity.YinshijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 饮食记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public class YinshijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 膳食
	 */
	
	private String shanshi;
		
	/**
	 * 摄入量
	 */
	
	private String sheruliang;
		
	/**
	 * 记录
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jilu;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：膳食
	 */
	 
	public void setShanshi(String shanshi) {
		this.shanshi = shanshi;
	}
	
	/**
	 * 获取：膳食
	 */
	public String getShanshi() {
		return shanshi;
	}
				
	
	/**
	 * 设置：摄入量
	 */
	 
	public void setSheruliang(String sheruliang) {
		this.sheruliang = sheruliang;
	}
	
	/**
	 * 获取：摄入量
	 */
	public String getSheruliang() {
		return sheruliang;
	}
				
	
	/**
	 * 设置：记录
	 */
	 
	public void setJilu(Date jilu) {
		this.jilu = jilu;
	}
	
	/**
	 * 获取：记录
	 */
	public Date getJilu() {
		return jilu;
	}
			
}
