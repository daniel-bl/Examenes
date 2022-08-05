package com.examen1.interfaces;

public class TrabajadoresVendedores implements Nomina{
	int salarioVendedores;
	@Override
	public String pagar() {
		return "Se le ha pagado a los vendedores";
	}
	@Override
	public String aumentarSalario(int aumento) {
		salarioVendedores += aumento;
		String res="Se ha aumentado: "+aumento + " a la nomina de los trabajadores de oficina, salario total: "+salarioVendedores;
		return res;
	}
	@Override
	public String reducirSalario(int monto) {
		salarioVendedores -= monto;
		String res="Se ha reducido: "+monto + " a la nomina de los trabajadores de oficina, salario total: "+salarioVendedores;
		return res;
	}
}
