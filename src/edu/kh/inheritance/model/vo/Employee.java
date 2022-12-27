package edu.kh.inheritance.model.vo;

public class Employee extends Person {
						// Person에게 상속 받음
	
	private String company;
	
	
	public Employee() {
		
	
	}

	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);  // 매개변수 순서,타입,개수 동일
		
		this.company = company;
		
		
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	// Person으로부터 상속 받은 메서드 중
	// move() 메서드를 Employee에 맞게 재정의( == Overriding)
	
	// @Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을 컴파일러에게 알려주는 역할.
	// Annotation : 컴파일러에게 알려주기 위한 코드(컴파일러 인식 주석 코드)
	
	
	@Override // 오버라이딩 시 작성  @ --> Annotation
	public void move() {
		// 기존 부모 코드를 삭제 후 자식이 새롭게 재정의
		System.out.println();
		System.out.println();
		System.out.println("오버라이딩 적용");
		System.out.println("오버라이딩 된 무브 메서드");
		System.out.println("직장인은 효율적으로 일하고 야근 안할래");
		System.out.println("직장인이 가장 많이 하는 말은 \"집에 가고싶다\" 이다.");
		
		
	}
	
	// 오버라이딩 성립 조건
	// 동일한 메서드 이름
	// 동일한 매개변수의 자료형 타입, 순서, 개수
	// 동일한 리턴타입
	// 접근제한자는 부모 클래스의 메서드와 같거나 더 넓은 범위
	// --> if protected면 protected or public이어야함
	// 예외처리 범위는 같거나 더 좁게 <=
	
	// 부모의 private 메서드는 오버라이딩 불가능
	
	// 다시 알게 된 것 : 부모로부터 상속 받지 못하는 건 초기화 블록, 부모 생성자, private으로 선언된 필드인줄 알았으나,  그게아니엿다.
	// private 멤버 변수들은 상속은 되지만 직접 접근 제한 원칙으로 인해서, 자식 생성자가 부모 필드 영역 멤버변수에 접근 불가
	// 그래서 super()를 통해서 전달 받은 필드값을 부모 생성자쪽으로 넘겨서 생성하거나 getter setter로 접근
	
	
	
	@Override
	public String toString() {
		return super.toString() + " / " + company;
		
		
	}
}
