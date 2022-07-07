package com.lgi.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lgi.app.action.Action;
import com.lgi.app.action.ActionForward;
import com.lgi.app.member.dao.MemberDAO;

public class MemberLoginOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		MemberDAO dao = new MemberDAO();
		//로그인 후 유지해야하기 때문에 session 필요
		HttpSession session = req.getSession();
		
		String memberId = req.getParameter("memberId");
		String memberPw = req.getParameter("memberPw");
		
		//로그인 후 그 전에 입력해둔것을 유지할 필요 x
		forward.setRedirect(true);
		
		// boolean으로 해뒀기 때문에 if문을 이용함
		if(dao.login(memberId, memberPw)) {
			session.setAttribute("sessionId", memberId);
			forward.setPath(req.getContextPath() + "/app/member/mainH.jsp");
		}else {
			forward.setPath(req.getContextPath() + "/member/MemberLogin.me?code=false");
		}
		
		return forward;
	}

}
