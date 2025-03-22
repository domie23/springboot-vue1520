package com.dao;

import com.entity.JiankangzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangzhishiVO;
import com.entity.view.JiankangzhishiView;


/**
 * 健康知识
 * 
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface JiankangzhishiDao extends BaseMapper<JiankangzhishiEntity> {
	
	List<JiankangzhishiVO> selectListVO(@Param("ew") Wrapper<JiankangzhishiEntity> wrapper);
	
	JiankangzhishiVO selectVO(@Param("ew") Wrapper<JiankangzhishiEntity> wrapper);
	
	List<JiankangzhishiView> selectListView(@Param("ew") Wrapper<JiankangzhishiEntity> wrapper);

	List<JiankangzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangzhishiEntity> wrapper);
	
	JiankangzhishiView selectView(@Param("ew") Wrapper<JiankangzhishiEntity> wrapper);
	
}
