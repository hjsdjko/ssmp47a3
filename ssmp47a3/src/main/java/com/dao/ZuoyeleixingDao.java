package com.dao;

import com.entity.ZuoyeleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyeleixingVO;
import com.entity.view.ZuoyeleixingView;


/**
 * 作业类型
 * 
 * @author 
 * @email 
 * @date 2021-03-11 13:13:47
 */
public interface ZuoyeleixingDao extends BaseMapper<ZuoyeleixingEntity> {
	
	List<ZuoyeleixingVO> selectListVO(@Param("ew") Wrapper<ZuoyeleixingEntity> wrapper);
	
	ZuoyeleixingVO selectVO(@Param("ew") Wrapper<ZuoyeleixingEntity> wrapper);
	
	List<ZuoyeleixingView> selectListView(@Param("ew") Wrapper<ZuoyeleixingEntity> wrapper);

	List<ZuoyeleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyeleixingEntity> wrapper);
	
	ZuoyeleixingView selectView(@Param("ew") Wrapper<ZuoyeleixingEntity> wrapper);
	
}
