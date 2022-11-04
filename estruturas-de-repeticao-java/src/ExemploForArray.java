//Estrutura condicional For Array
public class ExemploForArray {
    public static void main(String[] args) {
        //Declarando o Array (o índice começa em Zero)
        String alunos [] = {"Daniel", "Carlos", "Ana", "Caroline"};

        //Estrutura de repetição
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno de indice x = "+ x + " é " + alunos[x]);
        }
    }
}
