package com.spring.myweb.user.service;

import com.spring.myweb.command.UserVO;
import com.spring.myweb.util.PageVO;

public interface IUserService {

	//아이디 중복 확인
	int idCheck(String userId);
	
	//회원 가입
	void join(UserVO vo);
	
	//로그인
	String login(String userId, String userPw);
	
	//회원 정보 얻기
	UserVO getInfo(String userId, PageVO vo);
	
	//회원 정보 수정
	void updateUser(UserVO vo);
	
}
