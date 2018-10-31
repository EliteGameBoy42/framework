package first;

public class LastClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 12, 15, 19, 99, -45, 0, -23, -41 };
		int sum = 0;
		int pos = 0, neg = 0;

		for (int n = 0; n < A.length; n++) {
			sum = sum + A[n];
			if (A[n] > 0) {
				pos++;
			} else if (A[n] < 0) {
				neg++;
			} else {
				System.out.println("It is zero value");
			}
		}
		System.out.println("sum of array: " + sum);
		System.out.println("The count of positive: " + pos);
		System.out.println("The count of negetive : " + neg);
		System.out.println("The size of array: " + A.length);

		
		
		
		
		
		
		
	}

}
