package FactoryPattern;

public class MasinaFactory {
	public Masina getMasina(String tipMasina){
		if(tipMasina == null)
			return null;
		else if(tipMasina.equalsIgnoreCase("Audi"))
		{	
		return new MasinaAudi();
		}
		else if(tipMasina.equalsIgnoreCase("BMW")){
			
			return new MasinaBMW();
		}else if(tipMasina.equalsIgnoreCase("Dacia"))
			return new MasinaDacia();
		return null;
		
	}
}
	
	

