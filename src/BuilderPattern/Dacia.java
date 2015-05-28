package BuilderPattern;

public abstract class Dacia implements Masina {

	@Override
	public String tipul() {
		
		return "1310";
	}

	@Override
	public Caroserie caroserie() {
		return new Berlina();
	}

	@Override
	public int pret() {
		// TODO Auto-generated method stub
		return 100;
	}

}
