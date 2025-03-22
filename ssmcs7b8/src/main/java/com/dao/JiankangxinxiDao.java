package com.dao;

import com.entity.JiankangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangxinxiVO;
import com.entity.view.JiankangxinxiView;


/**
 * 健康信息
 * 
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface JiankangxinxiDao extends BaseMapper<JiankangxinxiEntity> {
	
	List<JiankangxinxiVO> selectListVO(@Param("ew") Wrapper<JiankangxinxiEntity> wrapper);
	
	JiankangxinxiVO selectVO(@Param("ew") Wrapper<JiankangxinxiEntity> wrapper);
	
	List<JiankangxinxiView> selectListView(@Param("ew") Wrapper<JiankangxinxiEntity> wrapper);

	List<JiankangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangxinxiEntity> wrapper);
	
	JiankangxinxiView selectView(@Param("ew") Wrapper<JiankangxinxiEntity> wrapper);
	
}
