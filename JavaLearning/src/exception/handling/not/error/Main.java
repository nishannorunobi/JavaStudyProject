package exception.handling.not.error;

public class Main {
	public String name;
	public Main() {
		// TODO Auto-generated constructor stub
		//this(1);
	}
	public Main(int value) {
		this();
	}

	public static void main(String[] args) {
		try {
			new Main().method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MainMehtod is completed");
	}
	public void method1(){
		method2();
		System.out.println("method1 is completed");
	}

	private void method2(){
		method3();
		System.out.println("method2 is completed");
	}

	private void method3(){
			System.out.println(8/0);
		
		System.out.println("method3 is completed");
	}

}
