import java.util.ArrayList;

public class CuentaAhorro extends CuentaCliente {
	
	private double tasaInteres;
	
	public CuentaAhorro(double saldoInicial, String cbuIngresado, Moneda nominacionIngresada,
			ArrayList<Cliente> titularesIniciales, double tasaInteresInicial) {
		super(saldoInicial, cbuIngresado, nominacionIngresada, titularesIniciales);
		this.tasaInteres = tasaInteresInicial;
		
	}

	@Override
	public void acreditar(double montoAAcreditar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debitar(double montoADebitar) {
		// TODO Auto-generated method stub

	}

}
