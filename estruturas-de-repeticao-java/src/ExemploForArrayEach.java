public class ExemploForArrayEach {
    public static void main(String[] args) {
        //Declarando o Array (o índice começa em Zero)
        String alunos [] = {"Daniel", "Carlos", "Ana", "Caroline"};

        //Estrutura de repetição
        for(String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
