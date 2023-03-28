package com.kh.inherit2.practice;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student[] sArry = new Student[3];
		
		Student st1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		Student st2 = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		Student st3 = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		sArry[0] = st1;
		sArry[1] = st2;
		sArry[2] = st3;
		
		for(Student s :sArry) {
			System.out.print(s.information());
		}
		

		Employee[] empArry = new Employee[10];

		int i = 0;
		while(true) {
			System.out.println("이름 : ");
			String name = scan.next();
			
			System.out.println("나이 : ");
			int age = scan.nextInt();
			
			System.out.println("신장 : ");
			double height = scan.nextDouble();
			
			System.out.println("몸무게 : ");
			double weight = scan.nextDouble();
			
			System.out.println("급여 : ");
			int salary = scan.nextInt();
			
			System.out.println("부서 : ");
			String dept = scan.next();
			
			Employee emp = new Employee(name, age, height, weight, salary, dept);
			
			empArry[i] = emp;

			i++;
			
			System.out.println("종료하고 싶으면 n을 누르세요");
			String out = scan.next();
			
			if(out.equals("n") || i == 2) {
				break;
		 
		}
			for(Employee e :empArry) {
				if(e == null) {
					break;
				}
				System.out.println(e.information());
			}
		
	}
}
}
