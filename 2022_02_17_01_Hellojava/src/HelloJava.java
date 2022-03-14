
public class HelloJava {
	public static void main(String[] args) {
		DataType dt = new DataType();
		dt.Print();
		
		// 객체생성(Instance)
		Class c = new Class();
		// private 멤버는 클래스 외부에서 접근불가
		//c.m_iPrivateVal = 10;
		//public 멤버는 클래스 외부에서 접근가능
		c.fPublicVal = 1.3F;
		
		c.FuncOver();
		c.FuncOver(1);
		c.FuncOver(1.2F);
		c.FuncOver(1,2);
		
	}

}
