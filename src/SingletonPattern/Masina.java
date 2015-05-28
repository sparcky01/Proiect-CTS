package SingletonPattern;

public class Masina {
	
	
		   private static Masina instance = new Masina();

		   private Masina(){}

		
		   public static Masina getInstance(){
		      return instance;
		   }

		   public void showMessage(){
		      System.out.println("Masina este Dacia 1310!");
		   
		   }
}
