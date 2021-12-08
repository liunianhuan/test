package com.pingjia.mapper;

import com.pingjia.pojo.Evaluate;
import com.pingjia.pojo.EvaluateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EvaluateMapper {
    int countByExample(EvaluateExample example);

    int deleteByExample(EvaluateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    List<Evaluate> selectByExample(EvaluateExample example);

    Evaluate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);
}