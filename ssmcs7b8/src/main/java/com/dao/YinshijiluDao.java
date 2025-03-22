package com.dao;

import com.entity.YinshijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinshijiluVO;
import com.entity.view.YinshijiluView;


/**
 * 饮食记录
 * 
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface YinshijiluDao extends BaseMapper<YinshijiluEntity> {
	
	List<YinshijiluVO> selectListVO(@Param("ew") Wrapper<YinshijiluEntity> wrapper);
	
	YinshijiluVO selectVO(@Param("ew") Wrapper<YinshijiluEntity> wrapper);
	
	List<YinshijiluView> selectListView(@Param("ew") Wrapper<YinshijiluEntity> wrapper);

	List<YinshijiluView> selectListView(Pagination page,@Param("ew") Wrapper<YinshijiluEntity> wrapper);
	
	YinshijiluView selectView(@Param("ew") Wrapper<YinshijiluEntity> wrapper);
	
}
