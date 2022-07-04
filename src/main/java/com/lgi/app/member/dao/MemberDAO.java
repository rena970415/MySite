package com.lgi.app.member.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lgi.app.member.vo.MemberVO;
import com.lgi.app.mybatis.config.MyBatisConfig;

public class MemberDAO {
	
	SqlSessionFactory sessionFactory = MyBatisConfig.getSqlsession_f();
	SqlSession sqlSession;
	
	
	// sql 설정
	public MemberDAO() {
		sqlSession = sessionFactory.openSession(true);
	}
	
	// 아이디 검사 매개변수로 ID 받아옴 그리고 맞냐 아니냐기 때문에 boolean 타입
	public boolean checkId(String memberId) {
		return  (Integer)(sqlSession.selectOne("Member.checkId", memberId)) == 1; 
		// -> 이 전체가 갯수가 됨 ( 전체를 파라미터로 넘겨야) 1개일시 중복 , 중복이 있을 경우 트루 / 이 전체를 리턴함 앞에 제네릭 타입을 인티저로함 형변환 관게연산자보다 형변환 연산자가 높음
	}
	// 회원가입
	public void join(MemberVO member) {
		sqlSession.insert("Member.join",member);
	}
	
	// 로그인
	public boolean login(String memberId, String memberPw) {
		HashMap<String, String> userMap = new HashMap<>();
		userMap.put("memberId", memberId);
		userMap.put("memberPw", memberPw);
		return (Integer)(sqlSession.selectOne("Member.login", userMap)) == 1;
	}
	
}
