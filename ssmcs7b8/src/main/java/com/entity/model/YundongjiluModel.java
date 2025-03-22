package com.entity.model;

import com.entity.YundongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 运动记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public class YundongjiluModel  implements Serializable {
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
	 * 运动
	 */
	
	private String yundong;
		
	/**
	 * 时长
	 */
	
	private String shizhang;
		
	/**
	 * 消耗
	 */
	
	private String xiaohao;
		
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
	 * 设置：运动
	 */
	 
	public void setYundong(String yundong) {
		this.yundong = yundong;
	}
	
	/**
	 * 获取：运动
	 */
	public String getYundong() {
		return yundong;
	}
				
	
	/**
	 * 设置：时长
	 */
	 
	public void setShizhang(String shizhang) {
		this.shizhang = shizhang;
	}
	
	/**
	 * 获取：时长
	 */
	public String getShizhang() {
		return shizhang;
	}
				
	
	/**
	 * 设置：消耗
	 */
	 
	public void setXiaohao(String xiaohao) {
		this.xiaohao = xiaohao;
	}
	
	/**
	 * 获取：消耗
	 */
	public String getXiaohao() {
		return xiaohao;
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
