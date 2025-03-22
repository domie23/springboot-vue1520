package com.dao;

import com.entity.DiscussjiankangzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangzhishiVO;
import com.entity.view.DiscussjiankangzhishiView;


/**
 * 健康知识评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-22 16:52:01
 */
public interface DiscussjiankangzhishiDao extends BaseMapper<DiscussjiankangzhishiEntity> {
	
	List<DiscussjiankangzhishiVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangzhishiEntity> wrapper);
	
	DiscussjiankangzhishiVO selectVO(@Param("ew") Wrapper<DiscussjiankangzhishiEntity> wrapper);
	
	List<DiscussjiankangzhishiView> selectListView(@Param("ew") Wrapper<DiscussjiankangzhishiEntity> wrapper);

	List<DiscussjiankangzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangzhishiEntity> wrapper);
	
	DiscussjiankangzhishiView selectView(@Param("ew") Wrapper<DiscussjiankangzhishiEntity> wrapper);
	
}
