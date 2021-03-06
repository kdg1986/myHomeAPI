package com.home.api.biz.study.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.api.biz.study.mapper.serviceDAO;
import com.home.api.biz.study.service.mainService;
import com.home.api.biz.study.serviceImpl.mainServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@RestController
public class mainController {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/*@Resource(name="main")*/
	@Autowired
    private mainService service;
	
	
	@RequestMapping( value="/api/table/{tableName}", method = RequestMethod.GET)
	public ResponseEntity<Object> main( @PathVariable String tableName ) throws Exception{
		
		List<Map<String, Object> > hm =  service.selectList(tableName);		
		return new ResponseEntity<>(hm, HttpStatus.OK);
	}
	
}
