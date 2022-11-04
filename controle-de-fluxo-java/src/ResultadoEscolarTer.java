//Condicional ternário
public class ResultadoEscolarTer {
    public static void main(String[] args) {
         //Variáveis
        int nota = 6;
        //Condicional ternária composta
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado"; //Se nota maior que 7 mostra Aprovado, se não mostra Reprovado.
        //Condicional ternária encadeada
        //String resultado = nota >= 7 ? "Aprovado": nota >=5 && nota < 7 ? "Recuperação" : "Reprovado"

        //Imprime o resultado do condicional
        System.out.println(resultado);
    }
}
