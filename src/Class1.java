
public class Class1 {
	Class2 c2;

	public Class1() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void method1() {
		System.out.println("Class1.method1");
		c2.method2();
	}
	
	public synchronized void method2() {
		System.out.println("Class1.method2");
	}
	
	public void method3() {
		System.out.println("Class1.method3");
	}
	
	public synchronized void method4() {
		System.out.println("Class1.method4");
	}
	
	public Class2 getC2() {
		return c2;
	}

	public void setC2(Class2 c2) {
		this.c2 = c2;
	}

}
