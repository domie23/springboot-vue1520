package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangzhishiView;


/**
 * 健康知识
 *
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface JiankangzhishiService extends IService<JiankangzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangzhishiVO> selectListVO(Wrapper<JiankangzhishiEntity> wrapper);
   	
   	JiankangzhishiVO selectVO(@Param("ew") Wrapper<JiankangzhishiEntity> wrapper);
   	
   	List<JiankangzhishiView> selectListView(Wrapper<JiankangzhishiEntity> wrapper);
   	
   	JiankangzhishiView selectView(@Param("ew") Wrapper<JiankangzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangzhishiEntity> wrapper);
   	
}

