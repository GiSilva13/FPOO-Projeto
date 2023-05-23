package operacional;

public class enun1 {
 
	private double N1;
	private double N2;
	private double getN1() {
		return N1;
	
	
	}
	
	public void exibirMaior() {
	
		if(getN1() > getN2()) {
			System.out.println("A NOTA 1 É MAIOR ");
		}else {
			System.out.println("A NOTA 2 É MAIOR ");
	
		
		}
	
	}
	
	public void setN1(double n1) {
		N1 = n1;
		
		
		
		}
	
	public double getN2() {
		return N2;
	}
	public void setN2(double n2) {
		N2 = n2;
		
	}
	
}

