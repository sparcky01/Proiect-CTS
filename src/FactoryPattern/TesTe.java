package FactoryPattern;

import java.util.regex.Pattern;

import javax.sound.sampled.Line;

public class TesTe {

	public int TestarePret(MasinaObject m,int pret){
		if(pret==0&&m==null)
			return 0;
		else 
			m.setPret(pret);
		return pret;
	

		
	}
	
	public int testareNrLoc(Masina m,int nrLoc)
	{
		
		if (nrLoc==0)
			return 0;
		if (nrLoc<5)
			return 0;
		if(nrLoc>7)
			return 0;
		if(nrLoc>7 && nrLoc <5)
		m.setNrLocuri(nrLoc);
		
		return nrLoc;
	}
	
	public String testareNrinmatriculare( String nrInmat)
	{
//		//salvez primele 2 caractere sa verific daca sunt litere
//		String judet =String.valueOf(nrInmat.charAt(0)+nrInmat.charAt(1));
//		
//		//salvez caracterele 4-5 sa verific daca sunt numere
//		String judetnumar = String.valueOf(nrInmat.charAt(4)+nrInmat.charAt(5));
//		
//		//salvez caracterele 6-7-8 sa verific daca sunt litere
//		String judetn= String.valueOf(nrInmat.charAt(6)+nrInmat.charAt(7)+nrInmat.charAt(8));
//		
//		 //salvez caracterele 1-5 sa verific daca sunt spatii, adica daca exista spatiu dupa primu
//		//caracter
//		String buc = String.valueOf(nrInmat.charAt(1)+nrInmat.charAt(5));
//		
//		//sa verific daca primu caracater este b
//		String b = String.valueOf(nrInmat.charAt(0));
//		
//		//sa verific daca caracterele 2,3,4 sunt cifre la bucuresti sunt 3 cifre pe nrdeinmatriculare
//		String nrbuc = String.valueOf(nrInmat.charAt(2)+nrInmat.charAt(3)+nrInmat.charAt(4));

//		if ((Pattern.matches("[a-zA-Z]+", judet))&&(Pattern.matches("[0-9]+", judetnumar))&&(Pattern.matches("[a-zA-Z]+", judetn)))
		
//		{
//			return nrInmat;
//		}
//
//		if((Pattern.matches("[ ]+", buc))&&(b=="B")&&(Pattern.matches("[0-9]+", nrbuc)))
//		{
//			return nrInmat;
//		}
//		
		
		if(nrInmat.length()==9)
		{
			return nrInmat;
		}
		else return null;
	}     

	
		public String TestareNume(String nume)
		{
		if (nume==null)
			return null;
		
		if (nume.length()<3)
			return null;
		
		if (nume.length()>20)
			return null;
		
		return nume;
		}

		public String testareCuloare(Masina m, String culoare)
		{
		
			if (culoare=="Rosu")
				return "Masina rosie";
			
			if (culoare=="Negru")
				return "Masina neagra";
			
			if(culoare=="Alb")
			m.setCuloare(culoare);
			
			return culoare;
		}
}
