
public class main {

	  public static void main(String[] args)
	  {

	     Rettangolo r = new Rettangolo(21,15);
	     
	     Rettangolo r2 = new Rettangolo (16,22);
	     stampaDueRettangoli(r, r2);
	     
	       
	   }
	  static void stampaRettangolo(Rettangolo obj)
	  {
	    System.out.println("L'area e' "+ obj.area());
	    System.out.println("Il perimetro e' "+ obj.perimetro());
	  }
	  
	  static void stampaDueRettangoli (Rettangolo obj1, Rettangolo obj2) {
		    stampaRettangolo(obj1);
			stampaRettangolo(obj2);
			
			double sommaPerimetro = obj1.perimetro()+ obj2.perimetro();
			double sommaArea = obj1.area()+ obj2.area();
			System.out.println("La somma dei perimetri è: " + sommaPerimetro);
			System.out.println("La somma delle aree è: " + sommaArea);
	  }

}
