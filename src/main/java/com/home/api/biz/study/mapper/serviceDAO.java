package com.home.api.biz.study.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface serviceDAO {
    
    List<Map<String, Object>> selectMap(@Param("tableName") String tableName);


}
