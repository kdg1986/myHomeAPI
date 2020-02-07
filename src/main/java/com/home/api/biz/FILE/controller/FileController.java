package com.home.api.biz.FILE.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.api.biz.study.mapper.serviceDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 */
@Controller
@RequestMapping(value = "/file")
public class FileController {
	/** Logger */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private serviceDAO service;
	
    @RequestMapping(value = "{name}")
    public ModelAndView FileMainController(ModelMap model) throws Exception {  
    	logger.info("asdasd");
    	    	
    	
        return new ModelAndView("/LGIN/login", model);
    }
	
	
}
