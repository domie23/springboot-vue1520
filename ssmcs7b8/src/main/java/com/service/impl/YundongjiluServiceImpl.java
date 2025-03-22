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


import com.dao.YundongjiluDao;
import com.entity.YundongjiluEntity;
import com.service.YundongjiluService;
import com.entity.vo.YundongjiluVO;
import com.entity.view.YundongjiluView;

@Service("yundongjiluService")
public class YundongjiluServiceImpl extends ServiceImpl<YundongjiluDao, YundongjiluEntity> implements YundongjiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YundongjiluEntity> page = this.selectPage(
                new Query<YundongjiluEntity>(params).getPage(),
                new EntityWrapper<YundongjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YundongjiluEntity> wrapper) {
		  Page<YundongjiluView> page =new Query<YundongjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YundongjiluVO> selectListVO(Wrapper<YundongjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YundongjiluVO selectVO(Wrapper<YundongjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YundongjiluView> selectListView(Wrapper<YundongjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YundongjiluView selectView(Wrapper<YundongjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
