package com.home.api.biz.study.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.api.biz.study.mapper.serviceDAO;

@Service
public class mainService {

	 @Autowired
	 private serviceDAO mapper;
	    
    public List<Map<String,Object>> selectList(String tableName) {
        return mapper.selectMap(tableName);
    }
	
}
