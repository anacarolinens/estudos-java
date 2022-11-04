//Condicinal encadeada
public class ResultadoEscolarEnc {

    public static void main(String[] args) {
        //Variáveis
        int nota = 7;

        //Controle de fluxo condicional
        if(nota >= 7)
            System.out.println("Aprovado!");

            //encadeamento
            else if (nota > 5 && nota < 7) //retorna true ou false
                System.out.println("Prova de recuperação.");
        
        else
            System.out.println("Reprovado.");
    }
}


