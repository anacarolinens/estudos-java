//Classe abstrata com todos os métodos abstratos, tem como característica solicitar 
//uma implementação que ela sozinha não consegue resolver.
.
public interface IConta {

    public void sacar(double valor);

    public void depositar(double valor);

    public void transferir(double valor, Conta contaDestino);

}
