package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszuoyexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszuoyexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszuoyexinxiView;


/**
 * 作业信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-11 13:13:47
 */
public interface DiscusszuoyexinxiService extends IService<DiscusszuoyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszuoyexinxiVO> selectListVO(Wrapper<DiscusszuoyexinxiEntity> wrapper);
   	
   	DiscusszuoyexinxiVO selectVO(@Param("ew") Wrapper<DiscusszuoyexinxiEntity> wrapper);
   	
   	List<DiscusszuoyexinxiView> selectListView(Wrapper<DiscusszuoyexinxiEntity> wrapper);
   	
   	DiscusszuoyexinxiView selectView(@Param("ew") Wrapper<DiscusszuoyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszuoyexinxiEntity> wrapper);
   	
}

