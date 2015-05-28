package FactoryPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestarePret {

	@Test
	public void test() {
		
			
			MasinaObject mas = new MasinaObject();
			TesTe t = new TesTe();
			int rezultat = t.TestarePret(mas,5);
			
			
			
			assertEquals(mas.getPret(), rezultat);
			
			
			
	}
	@Test
	public void testZero() {
		
			
			MasinaObject mas = null;
		    TesTe t = new TesTe();
			int rezultat = t.TestarePret(mas,0);
			
			assertEquals(0, rezultat);
			
			
			
	}
	@Test
	public void testUnu() {
		
		
		MasinaObject mas =new MasinaObject() ;
		
		
		TesTe t = new TesTe();
		int rezultat = t.TestarePret(mas, 1);
		
		assertEquals(1, rezultat);
		
	}
	
	
	
	
	
}
