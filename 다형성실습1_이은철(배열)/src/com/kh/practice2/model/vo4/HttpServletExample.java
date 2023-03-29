package com.kh.practice2.model.vo4;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet()); // 같은 위치라서 바로 method선언 가능 다른 클래스라면 클래스명.메소드
		method(new FileDownloadServlet());
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
