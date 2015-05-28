package FactoryPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestareNrInmatriculare {

	@Test
	public void test() {
String nrInmat = "B 192 AAA";
TesTe t = new TesTe();
String rezultat = t.testareNrinmatriculare(nrInmat);
assertEquals(nrInmat, rezultat);

}

	@Test
	public void testunu()
	{
		String nrInmat="CL 90 ASD";
		TesTe t = new TesTe();
	String rezultat = t.testareNrinmatriculare(nrInmat);
			assertEquals(nrInmat,rezultat);
		
	}
	@Test
	public void testdoi()
	
	{
		String nrInmat="CL90ASD";
		TesTe t = new TesTe();
		String rezultat=t.testareNrinmatriculare(nrInmat);
		assertEquals(null, rezultat);
		
	}
//	@Test
//	public void testrei()
//	
//	{
//		String nrInmat="";
//		TesTe t = new TesTe();
//		String rezultat=t.testareNrinmatriculare(nrInmat);
//		assertEquals(nrInmat, rezultat);
//		
//	}
//	
//	@Test
//	public void testpatru()
//	
//	{
//		String nrInmat="1";
//		TesTe t = new TesTe();
//		String rezultat=t.testareNrinmatriculare(nrInmat);
//		assertEquals(nrInmat, rezultat);
//		
//	}
}