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


import com.dao.ZuoyeleixingDao;
import com.entity.ZuoyeleixingEntity;
import com.service.ZuoyeleixingService;
import com.entity.vo.ZuoyeleixingVO;
import com.entity.view.ZuoyeleixingView;

@Service("zuoyeleixingService")
public class ZuoyeleixingServiceImpl extends ServiceImpl<ZuoyeleixingDao, ZuoyeleixingEntity> implements ZuoyeleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyeleixingEntity> page = this.selectPage(
                new Query<ZuoyeleixingEntity>(params).getPage(),
                new EntityWrapper<ZuoyeleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyeleixingEntity> wrapper) {
		  Page<ZuoyeleixingView> page =new Query<ZuoyeleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyeleixingVO> selectListVO(Wrapper<ZuoyeleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyeleixingVO selectVO(Wrapper<ZuoyeleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyeleixingView> selectListView(Wrapper<ZuoyeleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyeleixingView selectView(Wrapper<ZuoyeleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
