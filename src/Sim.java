
import java.util.Arrays;

public class Sim {
	int numero;
	double credito = 0.00;
	Call[] callList = null;
	
	public Sim (int num, double cred, Call[] lista) {
		this.numero = num;
		this.credito = cred;
		this.callList = lista;
	}
	public Sim(int num) {
        this.numero = num;
        this.credito = 0;
        this.callList = null;
    }

    public Sim(int num, double credito) {
        this.numero = num;
        this.credito = credito;
        this.callList = null;
    }
	
	public void stampaSim () {
		String arr = Arrays.toString(this.callList);
		System.out.println("Numero di telefono: " + this.numero + ", Credito: " + this.credito + " €, Lista Chiamate " + arr);
	}
}
