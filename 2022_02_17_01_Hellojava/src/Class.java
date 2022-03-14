
public class Class {

	private int m_iPrivateVal = 0;
	public float fPublicVal = 3.14F;
	// protected : 상속 시에 상속된 자식들만 접근가능
	// 생략시 default로 패키지 내에 있는 클래스들은 접근가능
	// 캡슐화(Encapsulation) 관점에는 멤버 변수는 숨겨지는게 좋음

	//Getter / Setter
	// 반환형(반환되는 자료형) / 함수명 / (매개변수)
	// void: 아무런 정보가 없는 자료형
	public void SetPrivateVal(int _val) {
		m_iPrivateVal = _val;
	}
	
	public int GetPrivateVal() {
		return m_iPrivateVal;
	}
	
	// 생성자(Constructor)
	// 객체가 생성되면 가장 먼저 '자동'으로 호출되는 함수
	/*
	 * 1. 반환형이 없음
	 * 2. 함수명이 클래스명과 동일
	 * 모든 클래스는 객체가 생성될 때 반드시 생성자가 호출 되어야 함
	 * 생성자를 호출하지 못한 클래스는 클래스로써의 역할을 하는 데 문제가 있음
	 * 생성자를 정의하지 않으면 기본 생성자(Default Constructor)를 자동 생성
	 */
	public Class() {
		System.out.println("Class Constructor Call!!");
	}
	
	// 함수 오버로딩(Function Overloading)
	public void FuncOver() {
		System.out.println("FuncOver Call!!");
	}
	
	public void FuncOver(int _val) {
		System.out.println("FuncOver(int) Call!!");
	}
	
	public void FuncOver(float _val) {
		System.out.println("FuncOver(float) Call!!");
	}
	
	public void FuncOver(int _lhs, int _rhs) {
		System.out.println("FuncOver(int, int) Call!!");
	}
	
	
	
	
}
