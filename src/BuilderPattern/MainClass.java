package BuilderPattern;

public class MainClass {
	
		   public static void main(String[] args) {
		   
		      ParcareBuilder parcB = new ParcareBuilder();

		      
		      Parcare Dacia = parcB.parcareDacia();
		      System.out.println("Parcare Dacia");
		      Dacia.showItems();
		    

		      
		     Parcare BMW = parcB.parcareBMW();
		      System.out.println("\n\nParcare BMW");
		      BMW.showItems();
		    
		   }
		}

