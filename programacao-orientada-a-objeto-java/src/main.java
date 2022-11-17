
public class main {
    public static void main(String[] args) {
        Cliente andre = new Cliente();
        IConta cc = new ContaCorrente();
        IConta cp = new ContaPoupanca();

        andre.setNome("André")

        cc.depositar(100);
        cc.transferir(100, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
    }
}
