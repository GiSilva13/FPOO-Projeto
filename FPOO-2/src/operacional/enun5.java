package operacional;

public class enun5 {

String op;
private int N1;
private int N2;
private int R;

public void Calculadora() {

 switch (getOp()) {
 case"+":
 R = getN1()+getN2();
 break;
 
 case"-":
 R = getN1()-getN2();
 break;
 
 case"*":
 R = getN1()*getN2();
 break;
 
 case"/":
 R = getN1()/getN2();
 break;
 
 case"%":
 R = getN1()%getN2();
 break;
 
 
 
 }
 

}

public int getR() {
	return R;
}

public void setR(int r) {
	R = r;
}

public String getOp() {
	return op;
}

public void setOp(String op) {
	this.op = op;
}

public int getN1() {
	return N1;
}

public void setN1(int n1) {
	N1 = n1;
}

public int getN2() {
	return N2;
}

public void setN2(int n2) {
	N2 = n2;
}





}
