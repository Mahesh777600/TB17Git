package LogicalProgram;

public class NestedElseIf {
	
	public static void main(String[] args) {
		
		int age=71;
		
		if(age>=18)
		{
			if(age<=70)
			{
				System.out.println("valid for vote");
			}
			else {
				
				System.out.println("your age is greater than 70");
			}
		}
		else {
			System.out.println("Age is not valid");
		}
	}

}
