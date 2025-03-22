package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YundongjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YundongjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YundongjiluView;


/**
 * 运动记录
 *
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface YundongjiluService extends IService<YundongjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YundongjiluVO> selectListVO(Wrapper<YundongjiluEntity> wrapper);
   	
   	YundongjiluVO selectVO(@Param("ew") Wrapper<YundongjiluEntity> wrapper);
   	
   	List<YundongjiluView> selectListView(Wrapper<YundongjiluEntity> wrapper);
   	
   	YundongjiluView selectView(@Param("ew") Wrapper<YundongjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YundongjiluEntity> wrapper);
   	
}

