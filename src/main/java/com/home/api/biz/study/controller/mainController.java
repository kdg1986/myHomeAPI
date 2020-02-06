package com.home.api.biz.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
public class mainController {
	
	@RequestMapping( value="/api/main", method = RequestMethod.GET)
	public ResponseEntity<Map<String,Object>> main(){
		Map<String,Object> rtn = new HashMap<String, Object>();
		
		
		rtn.put("res", "OK");
		rtn.put("req", "A");
		rtn.put("org", "B");
		
		
		return new ResponseEntity<>(rtn, HttpStatus.OK);
	}
	
}
