package FactoryPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestareNrLoc {

	@Test
	public void test() {
		MasinaFactory factory = new MasinaFactory();
		Masina masina1 = factory.getMasina("BMW");
		TesTe test = new TesTe();
	int rezultat = test.testareNrLoc(masina1, 4);
	assertEquals(masina1.getNrLocuri(), rezultat);
	}
	@Test
	public void test1() {
		MasinaFactory factory = new MasinaFactory();
		Masina masina1 = factory.getMasina("BMW");
		TesTe test = new TesTe();
	int rezultat = test.testareNrLoc(masina1, 0);
	assertEquals(masina1.getNrLocuri(), rezultat);
	}
	@Test
	public void test2() {
		MasinaFactory factory = new MasinaFactory();
		Masina masina1 = factory.getMasina("BMW");
		TesTe test = new TesTe();
	int rezultat = test.testareNrLoc(masina1, -1231);
	assertEquals(masina1.getNrLocuri(), rezultat);
	}
	@Test
	public void test3() {
		MasinaFactory factory = new MasinaFactory();
		Masina masina1 = factory.getMasina("BMW");
		TesTe test = new TesTe();
	int rezultat = test.testareNrLoc(masina1, 9129);
	assertEquals(masina1.getNrLocuri(), rezultat);
	}

}
