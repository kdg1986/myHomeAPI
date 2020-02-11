package com.home.api.biz.study.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

@Repository("mainDAO")
public class serviceDAO {
    
    @Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	public List<Map<String, Object>> selectMap(String tableName){		
		return sqlSession.selectList("testName.selectMap");
	}

}
