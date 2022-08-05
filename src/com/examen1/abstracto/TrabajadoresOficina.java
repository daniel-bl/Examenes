package com.examen1.abstracto;

public class TrabajadoresOficina extends Nomina{
	int salarioOficina;
	@Override
	public String pagar() {
		return "Se le ha pagado"+salarioOficina+" a los trabajadores de oficina";
	}
	
	@Override
	public String aumentarSalario(int aumento) {
		salarioOficina += aumento;
		String res="Se ha aumentado: "+aumento + " a la nomina de los trabajadores de oficina, salario total: "+salarioOficina;
		return res;
	}
	@Override
	public String reducirSalario(int monto) {
		salarioOficina -= monto;
		String res="Se ha reducido: "+monto + " a la nomina de los trabajadores de oficina, salario total: "+salarioOficina;
		return res;
	}
}
