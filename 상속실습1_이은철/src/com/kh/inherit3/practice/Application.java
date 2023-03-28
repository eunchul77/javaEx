package com.kh.inherit3.practice;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		Student s2 = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		Student s3 = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		Student[] sArry = new Student[3];

		sArry[0] = s1;
		sArry[1] = s2;
		sArry[2] = s3;

		for (Student s : sArry) {
			s.information();
		}

		Scanner scan = new Scanner(System.in);

		Employee[] empArry = new Employee[10];

		int index = 0;
		while (true) {
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
			empArry[index] = emp;
			emp.information();

			index++;

			System.out.println("계속 추가하시려면 y를 눌러주시고, 멈추시려면 n을 눌러주세요.");
			String say = scan.next();

			if (index == 10 || say.equals("n")) {
				for (Employee e : empArry) {
					if(e == null) {
						break;
					}
					e.information();	
				} 
				break;
				} 

			}

		}
	}

