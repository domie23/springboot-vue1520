package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangzhishiView;


/**
 * 健康知识评论表
 *
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface DiscussjiankangzhishiService extends IService<DiscussjiankangzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangzhishiVO> selectListVO(Wrapper<DiscussjiankangzhishiEntity> wrapper);
   	
   	DiscussjiankangzhishiVO selectVO(@Param("ew") Wrapper<DiscussjiankangzhishiEntity> wrapper);
   	
   	List<DiscussjiankangzhishiView> selectListView(Wrapper<DiscussjiankangzhishiEntity> wrapper);
   	
   	DiscussjiankangzhishiView selectView(@Param("ew") Wrapper<DiscussjiankangzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangzhishiEntity> wrapper);
   	
}

