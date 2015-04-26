package ar.edu.tallerweb.cuenta;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {
	
	@Test
	public void testDepositar(){
		Cuenta deposito = new Cuenta(1000,00);
		float depositoCuenta = deposito.depositar();
		Assert.assertEquals(1000, depositoCuenta,0.1);
	}
	
	@Test
	public void testExtraer(){
		Cuenta extraccion = new Cuenta(1000,00);
		float extraccionCuenta = extraccion.extraer();
		Assert.assertEquals(0, extraccionCuenta,0.1);
	}
}
