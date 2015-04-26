package ar.edu.tallerweb.cuenta;

public class Cuenta {
	
	float deposito;
	float extraccion;
	float saldo;
	
	public Cuenta(float deposito, float extraccion){
		
		this.deposito = deposito;
		this.extraccion = extraccion;
		this.saldo=0;
	}
	
	public float depositar(){
		
		if(this.deposito>0)
		{
			this.saldo = this.saldo+this.deposito;
			
		}
		return this.saldo;
			
	}
	

	public float extraer(){
			
			
			if(this.extraccion<0)
			{
				this.saldo = 0;
			}else
				if(this.extraccion<this.saldo)
				{
				
					this.saldo-=extraccion;
				}
			return this.saldo;
			
		}

}
