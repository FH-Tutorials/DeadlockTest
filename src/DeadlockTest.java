
public class DeadlockTest {
	public static void main(String args[]) {
		Class1 instanceClass1 = new Class1();
		Class2 instanceClass2 = new Class2();
		
		instanceClass1.setC2(instanceClass2);
		instanceClass2.setC1(instanceClass1);
		
		

		new Thread(new Runnable() {
			@Override
			public void run() {
				instanceClass1.method1();
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				instanceClass2.method1();
			}
		}).start();
	}
}
