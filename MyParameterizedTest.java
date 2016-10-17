package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class MyParameterizedTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	private double expected;
	private double val1;
	private double val2;

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}
	
//	public MyParameterizedTest() {
//		System.out.println("Constructor of ParameterizedTests");
//	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Parameters
	public static Collection<Integer[]> getTestParams() {
		return Arrays.asList(new Integer[][] {
			{2,1,1},
			{3,2,1},
			{4,3,1}
		});
	}
	
	public MyParameterizedTest(double expected, double val1, double val2) {
		
		this.expected  = expected;
		this.val1 = val1;
		this.val2 = val2;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "MyParameterizedTest [expected=" + expected + ", val1=" + val1 + ", val2=" + val2 + "]";
	}
	
	
	

}
