package com.lgi.app.member.vo;



public class MemberVO {
	private String memberId;
	private String memberPw;
	private int memberAge;
	private String memberName;
	private String memberGender;
	private String  memberEmail;

	
	// 기본생성자 생성
	public MemberVO() {;}

	
	// getter , setter 생성
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}


	public String getMemberEmail() {
		return memberEmail;
	}


	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberName() {
		return memberName;
	}
	
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
