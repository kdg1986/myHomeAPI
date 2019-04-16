package com.home.api.biz.FILE.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 */
@Controller
public class FileController {
	/** Logger */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @RequestMapping(value = {"/file.do"})
    public ModelAndView FileMainController(ModelMap model) throws Exception {  
    	logger.info("asdasd");
        return new ModelAndView("/LGIN/login", model);
    }
	
	
}
