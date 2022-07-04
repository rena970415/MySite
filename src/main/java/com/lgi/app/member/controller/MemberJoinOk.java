package com.lgi.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lgi.app.action.Action;
import com.lgi.app.action.ActionForward;
import com.lgi.app.member.dao.MemberDAO;
import com.lgi.app.member.vo.MemberVO;

public class MemberJoinOk implements Action {

	
	// 회원 가입을 위한 컨트롤러
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		// 받을 객체가 많음
		
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		
		// 회원가입 후 화면전환이 이루어 지므로 actionforward 사용
		ActionForward forward = new ActionForward();
		
		
		// 받을 값
		// MemberDAO에서 회원가입은 VO로 받기 때문에  VO 전달
		vo.setMemberId(req.getParameter("memberId"));
		vo.setMemberPw(req.getParameter("memberPw"));
		vo.setMemberName(req.getParameter("memberName"));
		vo.setMemberAge(Integer.parseInt(req.getParameter("memberAge")));
		vo.setMemberGender(req.getParameter("memberGender"));
		vo.setMemberEmail(req.getParameter("memberEmail"));
		
		// dao메소드를 컨트롤러에서 쓰고 회원 가입후 로그인 페이지로 이동시켜줌
		dao.join(vo);
		
		// 어떻게 보낼것인가 어떤 방식으로 보낼것인가
	    forward.setRedirect(true);
	    forward.setPath(req.getContextPath() + "/member/MemberLogin.me");
		
		
		
		
		return forward;
	}

}


//private String memberId;
//private String memberPw;
//private int memberAge;
//private String memberGender;
//private String  memberEmail;