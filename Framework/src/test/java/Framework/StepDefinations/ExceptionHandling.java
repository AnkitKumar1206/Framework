package Framework.StepDefinations;

public class ExceptionHandling {

	public static void main(String[] args) {
   	
		try {
			demo();
		} catch (Exception e) {
						e.printStackTrace();
		}
		
		/*try {
			
		System.out.println("Test In Progress");
		int i = 1/0;
		System.out.println("Completed Test");
				    }
				 catch (Exception exp) {
			
			 System.out.println(" Catch Block");
			 System.out.println("Message is :"+exp.getMessage());
		 }
				finally {
			System.out.println("Finally Block....!");
		}*/
	}
	
	public static  void demo() throws Exception {
	
		System.out.println("Test In Progress");
		int i = 1/0;
		System.out.println(i);
		throw new ArithmeticException("Invalid Operation");
		//System.out.println("Completed Test");
			}
}
