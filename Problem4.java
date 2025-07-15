package in.tandemloop;

public class Problem4 {
	
	public void count(int[] a) {
	    int[] count = new int[10];

	    for(int num : a) {
	        for (int i=1;i <= 9;i++) { 
	            if (num % i == 0) {
	                count[i]++;
	            }
	        }
	    }
	    
	    System.out.print("{");
	    for (int i =1;i<=9;i++) {
	        if (i != 9) {
	            System.out.print(i + ": " +count[i]+", ");
	        } else {
	            System.out.print(i + ": " +count[i]);
	        }
	    }
	    System.out.print("}");
	}

    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();
        int[] a = {1,2,8,9,12,46,76,82,15,20,30};
        problem4.count(a);
    }
    
}
