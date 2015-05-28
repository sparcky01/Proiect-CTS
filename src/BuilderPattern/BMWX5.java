package BuilderPattern;

public class BMWX5 extends BMW {
	@Override
	public String tipul() {
		// TODO Auto-generated method stub
		return "X5";
	}

	@Override
	public Caroserie caroserie() {
		return new Cabrio();
	}

	@Override
	public int pret() {
		// TODO Auto-generated method stub
		return 1200;
	}
	
}
