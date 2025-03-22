package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangpingguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangpingguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangpingguView;


/**
 * 健康评估
 *
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface JiankangpingguService extends IService<JiankangpingguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangpingguVO> selectListVO(Wrapper<JiankangpingguEntity> wrapper);
   	
   	JiankangpingguVO selectVO(@Param("ew") Wrapper<JiankangpingguEntity> wrapper);
   	
   	List<JiankangpingguView> selectListView(Wrapper<JiankangpingguEntity> wrapper);
   	
   	JiankangpingguView selectView(@Param("ew") Wrapper<JiankangpingguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangpingguEntity> wrapper);
   	
}

