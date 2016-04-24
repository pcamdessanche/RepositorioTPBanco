import java.util.ArrayList;

public abstract class CuentaCliente extends Cuenta {

	private boolean activo;
	private ArrayList<Cliente> titulares;
	
	public CuentaCliente(double saldoInicial, String cbuIngresado, Moneda nominacionIngresada, ArrayList<Cliente> titularesIniciales){
		super(cbuIngresado, nominacionIngresada);
		super.saldo = saldoInicial;
		this.activo = true;
		
		
	}


	public abstract void acreditar(double montoAAcreditar);

	public abstract void debitar(double montoADebitar);
}
