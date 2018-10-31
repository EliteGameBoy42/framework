package first;

public class FirstCoding {
	FirstCoding() {
		System.out.println("hello world");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("my age is 15");

		// Concat
		System.out.println("my age is " + 15);

		// Calculation
		System.out.println("calculate " + (4 + 4));

		// variables
		// variables can be changed throughout the coding process
		// such as first it can be int a=100; Then it can be just a= whatever number I
		// want

		// Integer (natural numbers),(whole numbers)
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;

		int e = c + d;
		System.out.println("sum of c and d is :::" + e);

		int f = c - d;
		System.out.println("deduction of c and d :::" + f);

		int g = c * d;
		System.out.println("c multiple d is :::" + g);

		int h = c / d;
		System.out.println("division of c and d is :::" + h);

		System.out.println(a);
		System.out.println(a + b);
		System.out.println("I am printing a " + a);
		System.out.println();
//	
		// assigning =
		// equal =

		// DEBUGGING

		// create three integer variables, assign 100, -36, 0 to these integers and
		// print is all in one line
		int ab = 100;
		int cd = -36;
		int ef = 0;

		System.out.println(ab + " " + cd + " " + ef);
		// Or it can be done like this

		System.out.print(ab);
		System.out.print(cd);
		System.out.println(ef);

		// print 10+15 results only
		System.out.println("Results::: " + (10 + 15));

		// print 88-20
		System.out.println("Results::: " + (88 - 20));

		// Print 159 module of 3 (159%3)
		System.out.println(159 % 3);

		Wednesday q = new Wednesday();

		q.sum(5, 25);

	}

}
