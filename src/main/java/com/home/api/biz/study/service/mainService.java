package com.home.api.biz.study.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.api.biz.study.mapper.serviceDAO;

public interface mainService {

	List<Map<String,Object>> selectList(String tableName) throws Exception;
	
}
