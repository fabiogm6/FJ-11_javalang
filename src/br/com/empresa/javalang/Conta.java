package br.com.empresa.javalang;

/**
* Classe responsável por moldar as Contas do Banco
*
* @author Fábio GM
* @version 1
* @category xyz
*/

public class Conta {
	protected double saldo;

	// getter setter
	public double getSaldo() {
		return this.saldo;
	}

	// methods
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public String toString() {
		return "Uma conta com valor: " + this.saldo;
	}
	

}
