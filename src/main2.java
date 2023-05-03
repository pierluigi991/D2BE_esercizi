
public class main2 {

	public static void main(String[] args) {
		Call call1 = new Call(1.45,53115);
		Call call2 = new Call(2.50,521);
		
		Call[] callList1 = {call1, call2};
		
		Sim sim1 = new Sim(123456,10.60, callList1);
		Sim sim2 = new Sim(789123, 2.30);
		Sim sim3 = new Sim(789123);
		sim1.stampaSim();
		sim2.stampaSim();
		sim3.stampaSim();

	}

}
