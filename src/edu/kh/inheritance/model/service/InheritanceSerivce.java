package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceSerivce {
	
	
	public void ex1() {
		// 상속 확인 메서드
		// - Person을 상속받은 Student가 Person의 필드와 메서드를 사용할 수 있는가?
		
		Person p = new Person(); // p라는 person객체 만들기
		
		p.setName("홍길동");
		p.setAge(22);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("==========================================");
	
		// Student 객체 생성
		
		Student std = new Student();
		
		std.setName("이현경");
		std.setNationality("미국");
		std.setAge(25);
		std.setGrade(5);
		std.setClassRoom(1);
		
		System.out.println(std.getGrade());
		System.out.println(std.getName());
	
		// Student 클래스를 통해서 Person 클래스 가 가지고 있는 필드들도 쓸 수 있게 되어있음.
		// 확장 되었기 때문에
		
		
		// Student가 Person의 메소드 뿐 아니라, 필드도 상속 받았는지 확인
		System.out.println("==========================================");
		
		System.out.println(std.getAge());
		System.out.println(std.getName());
		System.out.println(std.getNationality());
		
		
		System.out.println("==========================================");
		
		p.breath();
		std.breath();
		p.move();
		std.move();
		
		
		Employee emp = new Employee();
		
		
		emp.move();
		
	}
	
	public void ex2() {
		
		// super() 생성자 사용 방법
		
		Student std = new Student("김철수", 17, "한국", 1,3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		
		System.out.println("===============================================");

		
	}
	
	public void ex3() {
		
		Person p = new Person("이현경" , 25, "Republic of Korea");
		
		
		// toString() 오버라이딩 테스트
		System.out.println(p.toString());
		System.out.println(p);
		// print 구문 수행 시 참조변수 명을 작성하면
		// toString은 자동으로 toString 메서드를 호출해서 출력해줌
		
		
		// super 참조 변수 테스트
		
		Student std = new Student("이현경이다" , 18, "미국", 2, 6);
		
		System.out.println(std.toString());
		
		Employee emp = new Employee("이현경임" , 27 , "대한민국" , "K-Bank");

		System.out.println(emp.toString());
		
	}
}
