package ar.edu.tallerweb.cuenta;

public class CuentaTest {
	public static void main(String[] ar) {
		
		Cuenta saldo = new Cuenta();
		saldo.depositar(1000);
		saldo.extraer(100);
		saldo.saldo();
	}
}
