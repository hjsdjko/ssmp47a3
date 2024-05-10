package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyeleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyeleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyeleixingView;


/**
 * 作业类型
 *
 * @author 
 * @email 
 * @date 2021-03-11 13:13:47
 */
public interface ZuoyeleixingService extends IService<ZuoyeleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyeleixingVO> selectListVO(Wrapper<ZuoyeleixingEntity> wrapper);
   	
   	ZuoyeleixingVO selectVO(@Param("ew") Wrapper<ZuoyeleixingEntity> wrapper);
   	
   	List<ZuoyeleixingView> selectListView(Wrapper<ZuoyeleixingEntity> wrapper);
   	
   	ZuoyeleixingView selectView(@Param("ew") Wrapper<ZuoyeleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyeleixingEntity> wrapper);
   	
}

