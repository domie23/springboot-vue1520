package com.dao;

import com.entity.JiankangpingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangpingguVO;
import com.entity.view.JiankangpingguView;


/**
 * 健康评估
 * 
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface JiankangpingguDao extends BaseMapper<JiankangpingguEntity> {
	
	List<JiankangpingguVO> selectListVO(@Param("ew") Wrapper<JiankangpingguEntity> wrapper);
	
	JiankangpingguVO selectVO(@Param("ew") Wrapper<JiankangpingguEntity> wrapper);
	
	List<JiankangpingguView> selectListView(@Param("ew") Wrapper<JiankangpingguEntity> wrapper);

	List<JiankangpingguView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangpingguEntity> wrapper);
	
	JiankangpingguView selectView(@Param("ew") Wrapper<JiankangpingguEntity> wrapper);
	
}
