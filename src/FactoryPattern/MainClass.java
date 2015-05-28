package FactoryPattern;

public class MainClass {

	public static void main(String[] args) {
		MasinaFactory factory = new MasinaFactory();
		
		Masina audi = factory.getMasina("Audi");
		audi.afisareMasina();
		
		
		Masina bmw = factory.getMasina("BMW");
		bmw.afisareMasina();
		
		Masina dacia = factory.getMasina("Dacia");
		dacia.afisareMasina();
	}

}
