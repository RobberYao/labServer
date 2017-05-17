package com.labServer.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import com.labServer.Dao.LabModifyMapper;
import com.labServer.Util.MyBatisUtil;
import com.labServer.entity.LabModify;

public class LabModifyManagerImpl {

  /**
   * 通过原探头名找到探头校正实例
   * 
   * @param inputProbreNumber
   * @return
   */
  public List<Map<String, Double>> getLabModifyByInputProbNum(String inputProbreNumber) {
    SqlSession sqlSession = MyBatisUtil.getSqlSession();
    LabModifyMapper mapper = sqlSession.getMapper(LabModifyMapper.class);
    List<LabModify> labModifys = mapper.getLabModifyByInputProbNum(inputProbreNumber);
    List<Map<String, Double>> modify = new ArrayList<Map<String, Double>>();
    HashMap<String, Double> modifyMap = new HashMap<String, Double>();
    for (LabModify labModify : labModifys) {
      modifyMap.put(labModify.getModifyParamter(), labModify.getModifyNumber());
      modify.add(modifyMap);
    }
    sqlSession.close();
    return modify;
  }
}