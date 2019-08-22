package JunitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator cal = new Calculator();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHandleBackspace() {
		cal.setResultText("1711111");
		cal.handleBackspace();
		assertEquals("171111.0", cal.getResultText());
	}


	@Test
	public void testHandleC() {
		cal.setResultText("1711111");
		cal.handleC();
		assertEquals("0.0", cal.getResultText());
	}


	@Test
	public void testGetNumberFromText() {
		cal.setResultText("1711111");
		assertEquals("1711111.0", String.valueOf(cal.getNumberFromText()));
	}
	
	@Test
	public void testHandleOperator()
	{
		cal.setResultNum(15.6);
		cal.setResultText("15.6");
		cal.handleOperator("+");		
		cal.handleOperator("=");
		assertEquals("31.2", String.valueOf(cal.getResultNum()));
	}


}
