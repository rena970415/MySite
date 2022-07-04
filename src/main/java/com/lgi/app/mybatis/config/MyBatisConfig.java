package com.lgi.app.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	
	private static SqlSessionFactory sqlsession_f;
	
	
	static {
		try {
			// 경로 설정
			String resource ="./com/lgi/app/mybatis/config/config.xml";
			// 경로를 읽어올 친구
			Reader reader = Resources.getResourceAsReader(resource);
			// sqlFacfory생성
			sqlsession_f = new SqlSessionFactoryBuilder().build(reader);
			// 닫아주기
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			// 예외 발생시 강제로 종료
			throw new RuntimeException("초기화 오류 발생 , MybatisConfig.java");
			
		}
	}


	// private 이기 때문에 getter 생성
	public static SqlSessionFactory getSqlsession_f() {
		return sqlsession_f;
	}
}
