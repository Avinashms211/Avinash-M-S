package in.tandemloop;

public class Problem3 {
	
	public void series(int a) {

		int b =a;
		int c = 1;

		if (a % 2 == 0) {
			b = a - 1;

		} else {
			b = a;
		}
		for (int i =1;i<= b;i++) {
			if(i!=b) {
				System.out.print(c+", ");
			}else {
				System.out.print(c);
			}
			c+=2;
		}

	}

	public static void main(String[] args) {
		Problem3 problem3 = new Problem3();
		problem3.series(5);
		
		
	}
}
