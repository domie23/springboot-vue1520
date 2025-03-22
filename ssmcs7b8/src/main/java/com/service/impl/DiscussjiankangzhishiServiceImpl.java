package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjiankangzhishiDao;
import com.entity.DiscussjiankangzhishiEntity;
import com.service.DiscussjiankangzhishiService;
import com.entity.vo.DiscussjiankangzhishiVO;
import com.entity.view.DiscussjiankangzhishiView;

@Service("discussjiankangzhishiService")
public class DiscussjiankangzhishiServiceImpl extends ServiceImpl<DiscussjiankangzhishiDao, DiscussjiankangzhishiEntity> implements DiscussjiankangzhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankangzhishiEntity> page = this.selectPage(
                new Query<DiscussjiankangzhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankangzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankangzhishiEntity> wrapper) {
		  Page<DiscussjiankangzhishiView> page =new Query<DiscussjiankangzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankangzhishiVO> selectListVO(Wrapper<DiscussjiankangzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankangzhishiVO selectVO(Wrapper<DiscussjiankangzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankangzhishiView> selectListView(Wrapper<DiscussjiankangzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankangzhishiView selectView(Wrapper<DiscussjiankangzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
