package com.genpact.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		Calendar cal=Calendar.getInstance();
		int dayOfWeek=cal.get(cal.DAY_OF_WEEK);
		
		if(dayOfWeek==1){
			response.getWriter().write("The website is closed on sunday.Please try to access it on any other week day.");
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	
}
