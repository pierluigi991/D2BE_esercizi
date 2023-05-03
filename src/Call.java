

public class Call {
	double durata = 0.00;
	int phoneCall = 0;
	
	public Call (double durata, int phonCall) {
		this.durata = durata;
		this.phoneCall = phoneCall;
	}
	@Override
    public  String toString() {
        return "Durata chiamata: " + this.durata + ", Numero Chiamato: " + this.phoneCall;
    }
}