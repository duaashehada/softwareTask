package testCode;
import code.Calculater;



import org.junit.Assert;
import org.junit.Test;


public class CTest {

	@Test
	public void test() {
		int a = 10 ; 
		int b = 20 ; 
		 Calculater calc = new Calculater(); 
		
		int result = calc.add(a, b);
		
		  Assert.assertTrue(result > 0 ); 
	}

}
