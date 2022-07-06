package com.lgi.app.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lgi.app.board.vo.BoardVO;
import com.lgi.app.mybatis.config.MyBatisConfig;

public class BoardDAO {
	SqlSessionFactory sessionFactory = MyBatisConfig.getSqlsession_f();
	SqlSession sqlSession;
	
	public BoardDAO() {
		sqlSession = sessionFactory.openSession(true);
	}
	
	// 게시글 목록
	public List<BoardVO> getList(int startRow, int endRow) {
		Map<String, Integer> pageMap = new HashMap<String, Integer>();
		pageMap.put("startRow", startRow);
		pageMap.put("endRow", endRow);
		
		return sqlSession.selectList("Board.getList",pageMap);
	}
	
	
}