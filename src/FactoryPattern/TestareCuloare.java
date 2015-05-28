package FactoryPattern;

import static org.junit.Assert.*;

import org.hamcrest.Factory;
import org.junit.Test;

public class TestareCuloare {

	@Test
	public void test() {
		
		MasinaFactory factory = new MasinaFactory();
		Masina masina1 = factory.getMasina("Audi");
		TesTe t = new TesTe();
		String culoare = t.testareCuloare(masina1, "Alb");
assertEquals(masina1.getCuloare(), culoare);

	}

   @Test	
	public void testunu() {
		
		MasinaFactory factory = new MasinaFactory();
		Masina masina1 = factory.getMasina("Bmw");
		TesTe t = new TesTe();
		String culoare = t.testareCuloare(masina1, null);
assertEquals(masina1.getCuloare(), culoare);

	}

	
}
