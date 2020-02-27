package com.home.api.biz.study.controller;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class aaaa implements HandlerMethodArgumentResolver {
	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		
		System.out.println( "resolveArgument" );
		System.out.println( parameter );

		return null;
	}
	
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		System.out.println( "supportsParameter" );
		System.out.println( parameter );
		
		return false;
	}
}
