package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinshijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinshijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinshijiluView;


/**
 * 饮食记录
 *
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface YinshijiluService extends IService<YinshijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinshijiluVO> selectListVO(Wrapper<YinshijiluEntity> wrapper);
   	
   	YinshijiluVO selectVO(@Param("ew") Wrapper<YinshijiluEntity> wrapper);
   	
   	List<YinshijiluView> selectListView(Wrapper<YinshijiluEntity> wrapper);
   	
   	YinshijiluView selectView(@Param("ew") Wrapper<YinshijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinshijiluEntity> wrapper);
   	
}

