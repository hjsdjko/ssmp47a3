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


import com.dao.JiangshiDao;
import com.entity.JiangshiEntity;
import com.service.JiangshiService;
import com.entity.vo.JiangshiVO;
import com.entity.view.JiangshiView;

@Service("jiangshiService")
public class JiangshiServiceImpl extends ServiceImpl<JiangshiDao, JiangshiEntity> implements JiangshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangshiEntity> page = this.selectPage(
                new Query<JiangshiEntity>(params).getPage(),
                new EntityWrapper<JiangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangshiEntity> wrapper) {
		  Page<JiangshiView> page =new Query<JiangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangshiVO> selectListVO(Wrapper<JiangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangshiVO selectVO(Wrapper<JiangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangshiView> selectListView(Wrapper<JiangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangshiView selectView(Wrapper<JiangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
