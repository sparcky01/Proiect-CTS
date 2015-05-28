package BuilderPattern;

public class ParcareBuilder {
	

		   public static Parcare parcareDacia (){
		      Parcare parc = new Parcare();
		      parc.addMasina(new DaciaPapuc());
		      return parc;
		   }   

		   
		   public static Parcare parcareBMW(){
		      Parcare parc = new Parcare();
		      parc.addMasina(new BMWX5());
		      return parc;
		      
		   }
		   
		   
		}

