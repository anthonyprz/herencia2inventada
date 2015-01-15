package java2_herencia2;

public class Limpiador extends Empleado {
	
	String depositoDeMaterial;
	
	//setters
	public void setDepositoDeMaterial (String deposito){
		this.depositoDeMaterial = deposito;
	}
	//getters
	public String getDepositoDeMaterial (){
		return this.depositoDeMaterial;
	}
	
}
