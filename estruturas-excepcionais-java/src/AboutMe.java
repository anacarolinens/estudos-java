import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //Criando  o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Estrutura excepcinal
        try {
            //Obtendo o nome
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            //Obtendo o sobrenome
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            //Obtendo a idade
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            //Obtendo a altura
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //Imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();
            
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos!");
        }

    }
}
