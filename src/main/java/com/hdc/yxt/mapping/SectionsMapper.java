package com.hdc.yxt.mapping;

import com.hdc.yxt.entity.Sections;
import com.hdc.yxt.entity.SectionsExample;
import com.hdc.yxt.entity.SectionsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionsMapper {
    long countByExample(SectionsExample example);

    int deleteByExample(SectionsExample example);

    int deleteByPrimaryKey(SectionsKey key);

    int insert(Sections record);

    int insertSelective(Sections record);

    List<Sections> selectByExample(SectionsExample example);

    Sections selectByPrimaryKey(SectionsKey key);

    int updateByExampleSelective(@Param("record") Sections record, @Param("example") SectionsExample example);

    int updateByExample(@Param("record") Sections record, @Param("example") SectionsExample example);

    int updateByPrimaryKeySelective(Sections record);

    int updateByPrimaryKey(Sections record);
}