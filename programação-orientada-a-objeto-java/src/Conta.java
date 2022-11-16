//Classe mãe
public class Conta implements IConta{
    private int agencia; //ensapsulamento - private
    private int numero;
    private double saldo;

    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }
}
