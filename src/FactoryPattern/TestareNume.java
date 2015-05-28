package FactoryPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestareNume {

	@Test
	public void test() {
		String nume = null;
		TesTe t = new TesTe();
		String rezultat = t.TestareNume(nume);
		assertEquals(nume, rezultat);
	}
	@Test
	public void testunu() {
		String nume = "sd";
		TesTe t = new TesTe();
		String rezultat = t.TestareNume(nume);
		assertEquals(null, rezultat);
	}
	
	@Test
	public void testdoi() {
		String nume = "asdfghjkliytrewqasdfgrvtsjfjrbrhdbwjkdkdu";
		TesTe t = new TesTe();
		String rezultat = t.TestareNume(nume);
		assertEquals(null, rezultat);
	}
	@Test
	public void testtrei() {
		String nume = "asdfghrhdbwjkdkdu";
		TesTe t = new TesTe();
		String rezultat = t.TestareNume(nume);
		assertEquals(nume, rezultat);
	}
	
}
