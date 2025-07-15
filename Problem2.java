package in.tandemloop;

public class Problem2 {
public void series(int a) {
		
		int b=1;
		for(int i = 1;i<=a;i++) {
			if(i!=a) {
				System.out.print(b+", ");
				
			}else {
				System.out.println(b);
			}
			b+=2;
		}
	}
	public static void main(String[] args) {
		Problem2 problem2 = new Problem2();
		problem2.series(10);
	}
}
