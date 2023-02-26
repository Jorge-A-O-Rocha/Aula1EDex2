package controller;
public class modulos {
	public modulos() {
		super();
	}
	
	public int divide(int ndividido, int divisor) {
		//Condição de parada
		if (ndividido < divisor) {
		return ndividido;
		}else{
			ndividido = ndividido - divisor;
		return  divide(ndividido,divisor);
		}
	}
	
}