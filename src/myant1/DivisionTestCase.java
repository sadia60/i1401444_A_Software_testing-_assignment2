package myant1;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;
import myant1.Calculator_Test;
import myant1.Calculator;

import static org.hamcrest.CoreMatchers.is;

//import com.javawithease.business.*;
//import static org.junit.Assert.*;
//import org.junit.Test;
 //import DivisionTest;
public class DivisionTestCase {
	//DivisionTest class objects
	Calculator_Test divisionTest1 = new Calculator_Test(10, 2); 
	Calculator_Test divisionTest2 = new Calculator_Test(10, 0); 
	Calculator_Test addtwothree= new Calculator_Test(2,3);
	Calculator_Test caldiv= new Calculator_Test(2, 3);
	
	Calculator addtwothree1= new Calculator();
	 
	//Test case for division
	@Test
	public void test() {
		assertEquals(5, divisionTest1.division());
	}

	@Test
	public void test1() {
		assertEquals(0, divisionTest1.division());
	}
	//Test case for expected ArithmeticException, 
	//As in this case ArithmeticException
	// is the expected exception so JUnit 
	//will pass this unit test. 
	@Test(expected = ArithmeticException.class)  
	public void testException() {
		assertEquals(5, divisionTest2.division());
	}
	
	
	 @Test
	    public void twoAndThreeIsFive() throws Exception {
	        assertEquals(5,addtwothree.add());
	    }
	 
	    @Test
	    public void twoAndZeroIsTwo() throws Exception {
	        final long result = new Calculator().add(2, 0);
	        assertThat(result, is(2L));
	    }
	    public void twoAndMinusTwoIsZero() throws Exception {
	        final long result = new Calculator().add(2, -2);
	        assertThat(result, is(0L));
	    }

	       
	    
		 @Test
		    public void twoAndThreeIsFive1() throws Exception {
		        assertEquals(is(5L),caldiv.divide(4,0 )) ;
		    }


		 @Test
		    public void twoAndThreeIsFived() throws Exception {
		        assertEquals(is(1L),caldiv.divide(4,4 )) ;
		    }
		 
	    public void twoAndMinusTwodivide() throws Exception {
	        final long result = new Calculator().divide(2, 2);
	        assertThat(result, is(0L));
	    }
	    @Test
	    public void threeMinusTwoIsOne() throws Exception {
	        final long result = new Calculator().subtract(3, 2);
	        assertThat(result, is(1L));
	    }
	    @Test
	    public void threeMinusThreeIsZero() throws Exception {
	        final long result = new Calculator().subtract(3, 3);
	        assertThat(result, is(0L));
	    }
	    @Test
	    public void threeMinusMinusThreeIsSix() throws Exception {
	        final long result = new Calculator().subtract(3, -3);
	        assertThat(result, is(6L));
	    }
	    @Test
	    public void threeXThreeIsNine() throws Exception {
	        final long result = new Calculator().multiply(3, 3);
	        assertThat(result, is(9L));
	    }
	    @Test
	    public void threeXZeroIsZero() throws Exception {
	        final long result = new Calculator().multiply(3, 0);
	        assertThat(result, is(0L));
	    }
	    @Test
	    public void threeXMinusThreeIsMinusNine() throws Exception {
	        final long result = new Calculator().multiply(3, -3);
	        assertThat(result, is(-9L));
	    }
	    //fail the tests
	    @Test
	    public void threeMinusMinusThreeIsSix1() throws Exception {
	        final long result = new Calculator().subtract(3, -3);
	        assertThat(result, is(2L));
	    }

	    @Test
	    public void threeXZeroIsZero1() throws Exception {
	        final long result = new Calculator().multiply(3, 0);
	        assertThat(result, is(4L));
	    }


}