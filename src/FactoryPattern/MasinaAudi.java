package FactoryPattern;

public class MasinaAudi implements Masina {
MasinaObject m = new MasinaObject();
	
	@Override
	public void afisareMasina() {
		System.out.println("Audi");
	}

	@Override
	public void adaugarePret(int Pret) {
		m.pret=Pret;
		
	}

	@Override
	public int getNrLocuri() {
		// TODO Auto-generated method stub
		return m.getNrLocuri();	}

	@Override
	public void setNrLocuri(int nrLocuri) {
		// TODO Auto-generated method stub
		m.setNrLocuri(nrLocuri);
	}

	@Override
	public String getCuloare() {
		return m.getCuloare();
	}

	@Override
	public void setCuloare(String culoare) {
		m.setCuloare(culoare);
		
	}

}
