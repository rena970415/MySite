package com.lgi.app.action;

public class ActionForward {

	// 어디로 갈건지
	private String path;
	// 어떤 방식으로 갈건지 -> ture 면 redirect , false면 forward로
	private boolean isRedirect;
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

}
