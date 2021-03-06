package com.labServer.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.labServer.model.LabModify;

public interface LabModifyMapper {

	/**
	 * 通过原探头名找到探头校正实例
	 * 
	 * @param inputProbreNumber
	 * @return
	 */
	@Select("select * from lab_modify where INPUTPROBENUMBER =#{inputProbeNumber} and STATUS = 'Y' ")
	List<LabModify> getLabModifyByInputProbNum(String inputProbeNumber);

	@Select("select * from lab_modify where STATUS = 'Y' ")
	List<LabModify> getSumLabModify();

}
