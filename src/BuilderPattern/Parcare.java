package BuilderPattern;


import java.util.ArrayList;
import java.util.List;


public class Parcare {
	private List <Masina> items = new ArrayList<Masina>();	

	   public void addMasina(Masina masina){
	      items.add(masina);
	   }

	   public int getPret(){
	      int cost = 0;
	      
	      return cost;
	   }

	   
	   
	   public void showItems(){
	   
	      for (Masina item : items) {
	         System.out.print("Nume : " + item.tipul());
	         System.out.print(", Caroserie : " + item.caroserie().tipCaroserie());
	         System.out.println(", Pret : " + item.pret());
	      }		
	   }	
	}

