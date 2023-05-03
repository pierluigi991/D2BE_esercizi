
public class Rettangolo {
	   double base;
	   double altezza;


	  public Rettangolo(double b, double a)
	  {
	    this.base = b;
	    this.altezza = a;
	  }

	  public Rettangolo(Rettangolo r)
	  {
	    this.base = r.getBase();
	    this.altezza = r.getAltezza();    
	  }


	  public double getBase()
	  {
	    return this.base;
	  }

	  public double getAltezza()
	  {
	    return this.altezza;
	  }

	  public void setBase(double b)
	  {
	    this.base = b;
	  }

	  public void setAltezza(double a)
	  {
	    this.altezza = a;
	  }

	  public double area()
	  {
	    double area;
	    area = base * altezza;
	    return area;
	  }

	  public double perimetro()
	  {
	   double perimetro = (base + altezza) * 2;
	    return perimetro;
	  }

	  
}
