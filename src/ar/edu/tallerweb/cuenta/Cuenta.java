package ar.edu.tallerweb.cuenta;

public class Cuenta {
	
	int deposito;
	int saldo;
	int extraccion;
	
	public void saldo(){
		
		System.out.println("Su saldo actual es de $"+this.saldo+" pesos");
		
	}
	
	
	public int depositar(int deposito){
		
		this.deposito = deposito;
		if(this.deposito<0)
		{
			System.out.println("Error al cargar el deposito");
		}else{
			
			this.saldo+=deposito;
		}
		return this.saldo;
		
	}
	
public int extraer(int extraccion){
		
		this.extraccion = extraccion;
		if(this.extraccion<0)
		{
			System.out.println("Error al extraer su dinero");
		}else
			if(this.extraccion>this.saldo)
			{
				System.out.println("No tiene saldo para extraer");
			}else{
			
				this.saldo-=extraccion;
			}
		return this.saldo;
		
	}

}
