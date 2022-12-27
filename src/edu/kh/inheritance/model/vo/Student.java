package edu.kh.inheritance.model.vo;

public class Student extends Person {
						// extends
						// Student 클래스에 Person클래스 내용을 확장한다.
						// == Student 클래스에 Person 클래스 내용(속성,기능)이 추가됨.
	
	
	
	
	
	private int grade;
	private int classRoom;
	
	
	public Student() {
		
		// Student() 객체 생성 시, 
		// 내부에 상속받은 Person 객체를 생성하기 위한
		// Person 생성자 표출 코드가 필요하다
		// Person();  이렇게 쓰면 오류
		super(); // 슈퍼 생성자를 통해서 person 생성자(부모의 생성장)를 호출하는 코드
		// 반드시 자식 생성자 최상단에 있어야함.
		// 말 그대로 super위에 아무것도 있으면 안됨.
		
		
		// super()  생성자 미작성 시
		// 컴파일러가 컴파일 단계에서 자동으로 추가해줌
		
	}


	public Student(String name, int age, String nationality, int grade, int classRoom) {
		
		
		super(name, age, nationality); //매개변수 순서, 타입, 개수 동일  
		this.grade = grade;
		this.classRoom = classRoom;
		
		// super() 생성자
		// 1. 자식 내 부모 객체 생성
		// 2. 부모 객체 생성 시 초기화
		// 최상단에 위치 --> 부모 생성자가 가장 먼저 실행되어야 하기 떄문에
		
	}




	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassRoom() {
		return classRoom;
	}


	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	@Override
	
	public String toString() {  
		return super.toString() + " / " + grade + " / " + classRoom;
		
	}
	
	
	
}
