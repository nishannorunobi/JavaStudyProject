package overloading.overridding;

public class Main implements MyInterface{
	
	public Main() {
		
	}
	
	/*public void display(){
		
	}
	protected int display(){
		return 0;
	}*/
	
	@Override
	public void print() {
		System.out.println("helo");
	}
	
	public static void main(String [] args){
		/*int x = 11 & 9;
        int y = x ^ 3;
        System.out.println( y | 12 );*/

	}
	void m1(){
		int x = 11 & 9;
        int y = x ^ 3;
        System.out.println( y | 12 );
	}

}
