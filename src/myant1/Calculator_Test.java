package myant1;
import org.junit.Test;
public class Calculator_Test {
	//data members
	int num1, num2;
 
	//parameterised constructor
	public Calculator_Test(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
 
	

	//division method
	public int division() throws ArithmeticException{
		return num1/num2;
	}

//	public int multipication() {
//		return num1*num2;
//	}
//	public int subtraction() {
//		return num1-num2;
//	}
	
	public int add() {
		return num1+num2;
	}


	  public long add(long first, long second) {
	        return first + second;
	    }
	    public long subtract(long first, long second) {
	        return first - second;
	    }
	    public long multiply(long first, long second) {
	        return first * second;
	    }
	    public long divide(long first, long second) {
	        return first / second;
	    }
	
}