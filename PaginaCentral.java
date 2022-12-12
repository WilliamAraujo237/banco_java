package banco;

class PaginaCentral {

	public static void main(String[] args) {
		CriaConta primeiraConta = new CriaConta();
		primeiraConta.valor(200);
		System.out.println(primeiraConta.getSaldo());
		
		System.out.println("----------------------------------------------------");
		
		CriaConta segundaConta = new CriaConta();
		segundaConta.valor(50);
		segundaConta.valor(50);
		System.out.println("o valor da segunda conta é "+segundaConta.getSaldo());
		
		System.out.println("----------------------------------------------------");
		
		CriaConta terceiraConta = new CriaConta();
		terceiraConta.valor(100);
		terceiraConta.valor(50);
		System.out.println("o valor da terceira conta é R$:"+terceiraConta.getSaldo());
		boolean resultado = terceiraConta.saca(100);
		System.out.println("o valor da terceira conta após o sauqe é R$"+ terceiraConta.getSaldo());
		System.out.println("o resultado do saque foi "+ resultado);
		
		System.out.println("----------------------------------------------------");
		
		CriaConta quartaConta = new CriaConta();
		quartaConta.valor(1000);
		System.out.println("valor em conta da quarta conta R$ "+ quartaConta.getSaldo());
		if(quartaConta.transferencia(300, terceiraConta)) {
			System.out.println("transferencia feita com sucesso");
		}else {
			System.out.println("não foi possivel efetuar essa transferencia de valor");
		}
		System.out.println("valor em conta da quarta conta R$ "+ quartaConta.getSaldo());
		System.out.println("valor em conta da quarta conta R$ "+ terceiraConta.getSaldo());
		
		System.out.println("----------------------------------------------------");
		
		titular contaPaulo = new titular();
		contaPaulo.cpf = "444-444-444-44";
		contaPaulo.nome = "paulo";
		contaPaulo.profisão = "desenvolvedor";
		
		CriaConta paulo = new CriaConta();
		paulo.valor(3000);
		paulo.titulo = contaPaulo;
		System.out.println(paulo.titulo.nome);
		System.out.println(paulo.getSaldo());
		System.out.println(paulo.titulo.cpf);
		
		System.out.println("----------------------------------------------------");
		
		CriaConta contawilliam = new CriaConta();
		contawilliam.titulo = new titular();
		contawilliam.titulo.nome = "william Araujo";
		contawilliam.valor(300000);
		contawilliam.setAgencia(363);
		contawilliam.setNumeroDaconta(33333);
		contawilliam.titulo.cpf = "133.133.133-14";
		contawilliam.titulo.profisão = "programador";
		
		
		System.out.println(contawilliam.titulo.nome);
		System.out.println(contawilliam.getSaldo());
		System.out.println(contawilliam.getAgencia());
		System.out.println(contawilliam.getNumeroDaconta());
		System.out.println(contawilliam.titulo.cpf);
		System.out.println(contawilliam.titulo.profisão);
		
		System.out.println("----------------------------------------------------");
		
		
		
		}
}
