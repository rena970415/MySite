package com.lgi.app.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lgi.app.action.Action;
import com.lgi.app.action.ActionForward;
import com.lgi.app.board.dao.BoardDAO;

public class BoardListOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		BoardDAO dao = new BoardDAO();
		ActionForward forward = new ActionForward();
		
		String temp = req.getParameter("page");
		int page = temp == null? 1: Integer.parseInt(temp);
		int pageSize = 10;
		
		int endRow;
		int startRow;
		
		
		return null;
	}

}
