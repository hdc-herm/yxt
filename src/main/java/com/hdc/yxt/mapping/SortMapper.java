package com.hdc.yxt.mapping;

import com.hdc.yxt.entity.Sort;
import com.hdc.yxt.entity.SortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SortMapper {
    long countByExample(SortExample example);

    int deleteByExample(SortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sort record);

    int insertSelective(Sort record);

    List<Sort> selectByExample(SortExample example);

    Sort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sort record, @Param("example") SortExample example);

    int updateByExample(@Param("record") Sort record, @Param("example") SortExample example);

    int updateByPrimaryKeySelective(Sort record);

    int updateByPrimaryKey(Sort record);
}