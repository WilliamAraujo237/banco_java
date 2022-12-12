package banco;

public class CriaConta {
	private double saldo;
	private int agencia;
	private int numeroDaconta;
	titular titulo;
 
	public void valor(double valor) {
		this.saldo = this.saldo + valor;
	}
 
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferencia(double valorTransferencia, CriaConta conta) {
		if (this.saldo >= valorTransferencia) {
			this.saldo -= valorTransferencia;
			conta.valor(valorTransferencia);
			return true;
			}
			return false;
			
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setNumeroDaconta(int numeroDaconta) {
		this.numeroDaconta = numeroDaconta;
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroDaconta() {
		return numeroDaconta;
	}
	public double getSaldo() {
		return saldo;
	}
}
