package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiankangzhishiEntity;
import com.entity.view.JiankangzhishiView;

import com.service.JiankangzhishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 健康知识
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
@RestController
@RequestMapping("/jiankangzhishi")
public class JiankangzhishiController {
    @Autowired
    private JiankangzhishiService jiankangzhishiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangzhishiEntity jiankangzhishi, HttpServletRequest request){

        EntityWrapper<JiankangzhishiEntity> ew = new EntityWrapper<JiankangzhishiEntity>();
		PageUtils page = jiankangzhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangzhishi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangzhishiEntity jiankangzhishi, HttpServletRequest request){
        EntityWrapper<JiankangzhishiEntity> ew = new EntityWrapper<JiankangzhishiEntity>();
		PageUtils page = jiankangzhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangzhishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangzhishiEntity jiankangzhishi){
       	EntityWrapper<JiankangzhishiEntity> ew = new EntityWrapper<JiankangzhishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankangzhishi, "jiankangzhishi")); 
        return R.ok().put("data", jiankangzhishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangzhishiEntity jiankangzhishi){
        EntityWrapper< JiankangzhishiEntity> ew = new EntityWrapper< JiankangzhishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankangzhishi, "jiankangzhishi")); 
		JiankangzhishiView jiankangzhishiView =  jiankangzhishiService.selectView(ew);
		return R.ok("查询健康知识成功").put("data", jiankangzhishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangzhishiEntity jiankangzhishi = jiankangzhishiService.selectById(id);
        return R.ok().put("data", jiankangzhishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangzhishiEntity jiankangzhishi = jiankangzhishiService.selectById(id);
        return R.ok().put("data", jiankangzhishi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        JiankangzhishiEntity jiankangzhishi = jiankangzhishiService.selectById(id);
        if(type.equals("1")) {
        	jiankangzhishi.setThumbsupnum(jiankangzhishi.getThumbsupnum()+1);
        } else {
        	jiankangzhishi.setCrazilynum(jiankangzhishi.getCrazilynum()+1);
        }
        jiankangzhishiService.updateById(jiankangzhishi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangzhishiEntity jiankangzhishi, HttpServletRequest request){
    	jiankangzhishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangzhishi);

        jiankangzhishiService.insert(jiankangzhishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangzhishiEntity jiankangzhishi, HttpServletRequest request){
    	jiankangzhishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangzhishi);

        jiankangzhishiService.insert(jiankangzhishi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiankangzhishiEntity jiankangzhishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankangzhishi);
        jiankangzhishiService.updateById(jiankangzhishi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangzhishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiankangzhishiEntity> wrapper = new EntityWrapper<JiankangzhishiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jiankangzhishiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
