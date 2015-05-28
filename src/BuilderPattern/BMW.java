package BuilderPattern;

public abstract class BMW implements Masina{

	@Override
	public String tipul() {
		// TODO Auto-generated method stub
		return "Seria 3";
	}

	@Override
	public Caroserie caroserie() {
		return new Cabrio();
	}

	@Override
	public int pret() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
