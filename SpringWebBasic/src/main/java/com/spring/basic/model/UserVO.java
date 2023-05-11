package com.spring.basic.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserVO {

	private String userId;
	private String userPw;
	private String userName;
	private List<String> hobby;
	
//	lombok으로 쓸모 없어짐(1.18.26ver)
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	public String getUserPw() {
//		return userPw;
//	}
//	public void setUserPw(String userPw) {
//		this.userPw = userPw;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public List<String> getHobby() {
//		return hobby;
//	}
//	public void setHobby(List<String> hobby) {
//		this.hobby = hobby;
//	}
//	
//	@Override
//	public String toString() {
//		return "UserVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", hobby=" + hobby + "]";
//	}
//	
	
	
}
