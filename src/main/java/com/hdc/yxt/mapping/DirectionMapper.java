package com.hdc.yxt.mapping;

import com.hdc.yxt.entity.Direction;
import com.hdc.yxt.entity.DirectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirectionMapper {
    long countByExample(DirectionExample example);

    int deleteByExample(DirectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Direction record);

    int insertSelective(Direction record);

    List<Direction> selectByExample(DirectionExample example);

    Direction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Direction record, @Param("example") DirectionExample example);

    int updateByExample(@Param("record") Direction record, @Param("example") DirectionExample example);

    int updateByPrimaryKeySelective(Direction record);

    int updateByPrimaryKey(Direction record);
}