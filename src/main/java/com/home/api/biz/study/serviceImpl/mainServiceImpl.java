package com.home.api.biz.study.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.home.api.biz.study.mapper.serviceDAO;
import com.home.api.biz.study.service.mainService;

@Service
public class mainServiceImpl implements mainService {

	@Resource(name = "mainDAO")
	 private serviceDAO mapper;
	    
   public List<Map<String,Object>> selectList(String tableName) {
       return mapper.selectMap(tableName);
   }
}
