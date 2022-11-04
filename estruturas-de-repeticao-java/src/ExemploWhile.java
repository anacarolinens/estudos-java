import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        //Variáveis
        double mesada = 50.0;

        //Estutura de repetição While
        while(mesada > 0){
            Double valorDoce = valorAleatorio();
                if(valorDoce > mesada)
                    valorDoce = mesada;
                
                    System.out.println("Doce do valor: " + valorDoce + " adicionado com sucesso!");
                    mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces!");
    }



    //obter o valor aleatório
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
