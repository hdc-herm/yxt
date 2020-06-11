package com.hdc.yxt.mapping;

import com.hdc.yxt.entity.Chapters;
import com.hdc.yxt.entity.ChaptersExample;
import com.hdc.yxt.entity.ChaptersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChaptersMapper {
    long countByExample(ChaptersExample example);

    int deleteByExample(ChaptersExample example);

    int deleteByPrimaryKey(ChaptersKey key);

    int insert(Chapters record);

    int insertSelective(Chapters record);

    List<Chapters> selectByExample(ChaptersExample example);

    Chapters selectByPrimaryKey(ChaptersKey key);

    int updateByExampleSelective(@Param("record") Chapters record, @Param("example") ChaptersExample example);

    int updateByExample(@Param("record") Chapters record, @Param("example") ChaptersExample example);

    int updateByPrimaryKeySelective(Chapters record);

    int updateByPrimaryKey(Chapters record);
}