package first;


public class Wednesday {
Wednesday(){System.out.println("syful");

}
	public void sum(int a, int b) {
	 int sum=0;
	 
	 sum=a+b;
	 System.out.println("sum is "+sum);
	}
	
	public void String() {
	String s="This is my own code";
	System.out.println(s);
	}

	public String print(String a) {
		String d="*********"+a+"************";
		return d;
	}
	
	
	
	
	
	
	
	
	// Main method
	public static void main(String[] args) {

	//Creating a object for class
		Wednesday m=new Wednesday();
		m.sum(7, 5);
		
		m.sum(11, 8);
		m.sum(-11, 9);
		
		Wednesday dd=new Wednesday();
		
		
		
		Wednesday r=new Wednesday();
		r.String();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
