package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangshiView;


/**
 * 讲师
 *
 * @author 
 * @email 
 * @date 2021-03-11 13:13:47
 */
public interface JiangshiService extends IService<JiangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangshiVO> selectListVO(Wrapper<JiangshiEntity> wrapper);
   	
   	JiangshiVO selectVO(@Param("ew") Wrapper<JiangshiEntity> wrapper);
   	
   	List<JiangshiView> selectListView(Wrapper<JiangshiEntity> wrapper);
   	
   	JiangshiView selectView(@Param("ew") Wrapper<JiangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangshiEntity> wrapper);
   	
}

