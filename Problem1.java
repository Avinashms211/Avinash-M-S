package in.tandemloop;

public class Problem1 {

	public double addition(double a,double b) {
		return a+b;
	}

	public double subtraction(double a,double b) {
		return a-b;
	}

	public double multiplication(double a,double b) {
		return a*b;
	}

	public double division(double a,double b) {
		return a/b;
	}

	public void calc(double a,double b,String operator) {

		switch (operator.toLowerCase()) {
		case "add":
			System.out.println("Result: "+addition(a,b));
			break;
			
		case "subtract":
			System.out.println("Result:"+subtraction(a,b));
			break;
			
		case "multiply":
			System.out.println("Result:"+multiplication(a,b));
			break;
			
		case "divide":
		    if (b == 0) {
		        System.out.println("b should > 0");
		    } else {
		        System.out.println("Result: "+ division(a,b));
		    }
		    break;
		    
		default:
			System.out.println("Enter valid operation");
		}
	}

	public static void main(String[] args) {
		Problem1 problem1 = new Problem1();
		problem1.calc(10,2,"divide");

	}

}
