package taxreturn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaxReturnSampleTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		TaxReturn aTaxReturn = new TaxReturn(10000, 2);
		System.out.println("Your tax is " + aTaxReturn.getTax());
		assertTrue(aTaxReturn.getTax()>=0);
	}

}
