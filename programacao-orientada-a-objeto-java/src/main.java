public class main {
    public static void main(String[] args) {
		Cliente ana = new Cliente();
		ana.setNome("Ana");
		
		Conta cc = new ContaCorrente(ana);
		Conta poupanca = new ContaPoupanca(ana);

		cc.depositar(200);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
