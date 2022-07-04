package com.lgi.app.member.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.lgi.app.action.Action;
import com.lgi.app.action.ActionForward;
import com.lgi.app.member.dao.MemberDAO;

import netscape.javascript.JSObject;

// 아이디 중복검사 콘트롤러
public class MemberCheckIdOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		// 받아올 아이디를 memberId에 담음
		String memberId = req.getParameter("memberId");
		MemberDAO dao = new MemberDAO();
		JSONObject obj = new JSONObject();
		//html body 태그에 집어넣어줄 친구
		PrintWriter out = resp.getWriter();
		
		// Json을 사용  빌드 패스에 제이슨심플라이브러리 추가
		if(dao.checkId(memberId)) {
			obj.put("status", "not-ok");
		}else {
			obj.put("status", "ok");
		}
		out.println(obj.toJSONString());
		out.close();
		
		return null;
	}

	
	
	
	
}
