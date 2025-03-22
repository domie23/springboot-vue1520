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


import com.dao.JiankangpingguDao;
import com.entity.JiankangpingguEntity;
import com.service.JiankangpingguService;
import com.entity.vo.JiankangpingguVO;
import com.entity.view.JiankangpingguView;

@Service("jiankangpingguService")
public class JiankangpingguServiceImpl extends ServiceImpl<JiankangpingguDao, JiankangpingguEntity> implements JiankangpingguService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangpingguEntity> page = this.selectPage(
                new Query<JiankangpingguEntity>(params).getPage(),
                new EntityWrapper<JiankangpingguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangpingguEntity> wrapper) {
		  Page<JiankangpingguView> page =new Query<JiankangpingguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangpingguVO> selectListVO(Wrapper<JiankangpingguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangpingguVO selectVO(Wrapper<JiankangpingguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangpingguView> selectListView(Wrapper<JiankangpingguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangpingguView selectView(Wrapper<JiankangpingguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
