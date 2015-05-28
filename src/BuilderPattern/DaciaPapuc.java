package BuilderPattern;

public class DaciaPapuc extends Dacia {
	@Override
	public String tipul() {
		
		return "Papuc";
	}

	@Override
	public Caroserie caroserie() {
		return new Berlina();
	}

	@Override
	public int pret() {

		return 200;
	}
}
