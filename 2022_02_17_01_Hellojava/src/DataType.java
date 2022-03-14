
public class DataType {
	// Class Member Variables
	// 자료형(Data Type)
	// 정수형(Integer)
	/*
	 * 1. 메모리 관리, 효율성
	 * 2. 엄격한 자료형
	 */
	public byte b = 1; //   1Byte 0~255
	public short s = 10;//  2Byte short int
	public int i = 100;//   4Byte integer
	public long l = 1000;// 8Byte long int
	
	// 실수형(Floating-Point, 부동소수점)
	private float f = 3.14F; // 4Byte
	// Double Precision Floating-Point 두배 정밀도 부동소수점
	private double d = 3.14; // 8Byte
	
	// 문자, 문자열
	protected char c = 'c'; // 2Byte, character
	protected String str = "String"; // char[]
	
	// 참, 거짓
	public boolean bool = true;
	
	public void Print() {
		System.out.println("byte: " + b + "(" + Byte.BYTES + "byte");
		System.out.println(s + "(" + Short.BYTES + "byte");
		System.out.println(i + "(" + Integer.BYTES + "byte");
		System.out.println(l + "(" + Long.BYTES + "byte");
		
		System.out.println(f + "(" + Float.BYTES + "byte");
		System.out.println(d + "(" + Double.BYTES + "byte");
		
		System.out.println(c + "(" + Character.BYTES + "byte");
		System.out.println(str);
		
		System.out.println("boolean: " + bool);
	}
	

}
