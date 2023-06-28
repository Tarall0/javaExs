abstract class Test{
	
	public abstract void method();
	
}

public class De {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new Test() {
			public void method() {
				System.out.println("Anon Inner Class");
			}
		};
		 
		obj.method();

	}

}
