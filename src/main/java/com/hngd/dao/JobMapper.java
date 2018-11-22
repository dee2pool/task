package com.hngd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hngd.model.TaskExample;
import com.hngd.model.TaskPo;
import com.hngd.model.TaskVo;

public interface JobMapper {
	
	int insertSelective(TaskPo record);
	
	List<TaskVo> selectByExample(TaskExample example);
	
	int updateByExampleSelective(@Param("record")TaskPo record,@Param("example")TaskExample example);
}
