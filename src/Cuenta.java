import java.util.ArrayList;

public abstract class Cuenta {

	protected final String cbu;
	protected Moneda nominacion;
	protected double saldo;
	protected ArrayList<Transacciones> historicoMov;
	
	public Cuenta(String cbuIngresado, Moneda nominacionIngresada){
		this.cbu = cbuIngresado;
		this.nominacion = nominacionIngresada;
	}
	
	public abstract void acreditar (double montoAAcreditar);
	
	public abstract void debitar (double montoADebitar);
	
	public String getCbu(){
		return this.cbu;
	}
	
	public Moneda getMoneda(){
		return this.nominacion;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
}

