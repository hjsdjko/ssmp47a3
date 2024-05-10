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


import com.dao.DiscusszuoyexinxiDao;
import com.entity.DiscusszuoyexinxiEntity;
import com.service.DiscusszuoyexinxiService;
import com.entity.vo.DiscusszuoyexinxiVO;
import com.entity.view.DiscusszuoyexinxiView;

@Service("discusszuoyexinxiService")
public class DiscusszuoyexinxiServiceImpl extends ServiceImpl<DiscusszuoyexinxiDao, DiscusszuoyexinxiEntity> implements DiscusszuoyexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszuoyexinxiEntity> page = this.selectPage(
                new Query<DiscusszuoyexinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszuoyexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszuoyexinxiEntity> wrapper) {
		  Page<DiscusszuoyexinxiView> page =new Query<DiscusszuoyexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszuoyexinxiVO> selectListVO(Wrapper<DiscusszuoyexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszuoyexinxiVO selectVO(Wrapper<DiscusszuoyexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszuoyexinxiView> selectListView(Wrapper<DiscusszuoyexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszuoyexinxiView selectView(Wrapper<DiscusszuoyexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
