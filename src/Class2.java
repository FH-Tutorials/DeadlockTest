
public class Class2 {
	Class1 c1;
	
	public Class2() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void method1() {
		System.out.println("Class2.method1");
		c1.method4();
	}
	
	public synchronized void method2() {
		System.out.println("Class2.method2");
	}
	
	public void method3() {
		System.out.println("Class2.method3");
	}
	
	public synchronized void method4() {
		System.out.println("Class2.method4");
	}
	
	public Class1 getC1() {
		return c1;
	}

	public void setC1(Class1 c1) {
		this.c1 = c1;
	}
}
