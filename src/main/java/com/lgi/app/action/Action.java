package com.lgi.app.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	
	// 추상메서드로 지정	
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp)  throws Exception;
		
	
}
