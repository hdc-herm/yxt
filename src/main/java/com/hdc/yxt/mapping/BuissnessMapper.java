package com.hdc.yxt.mapping;

import com.hdc.yxt.entity.Buissness;
import com.hdc.yxt.entity.BuissnessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuissnessMapper {
    long countByExample(BuissnessExample example);

    int deleteByExample(BuissnessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Buissness record);

    int insertSelective(Buissness record);

    List<Buissness> selectByExample(BuissnessExample example);

    Buissness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Buissness record, @Param("example") BuissnessExample example);

    int updateByExample(@Param("record") Buissness record, @Param("example") BuissnessExample example);

    int updateByPrimaryKeySelective(Buissness record);

    int updateByPrimaryKey(Buissness record);
}