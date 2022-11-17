//Classe abstrata com todos os métodos abstratos, tem como característica solicitar 
//uma implementação que ela sozinha não consegue resolver.
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);
    
    void imprimirExtrato();

}
