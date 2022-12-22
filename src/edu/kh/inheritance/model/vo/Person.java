package edu.kh.inheritance.model.vo;

public class Person {
	
	// 필드
	// 국민이라면 가지고 있는 것
	private String name;
	private int age;
	private String nationality;
	
	
	// 생성자
	public Person() {	
	}

	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	public String getName() {
		return name; // 리턴 꼭 기억하자...
	}

	public void setName(String name) { // 받아오는 애가 있기에 매개변수를 작서앟고 this작성
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	// 메서드
	
	
	public void breath() {
		System.out.println("사람은 코나 입으로 숨쉰다.");
		
		
	}
	
	public void move() {
		System.out.println("사람은 움직일 수 있다.");
		
	}
	
	// toString() 메서드는 객체가 가지고 있는 모든 값(필드)을
	// 하나의 문자열로 반환하는 용도
	
	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality;
		
	}
	

}
