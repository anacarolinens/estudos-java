public class ExemploContinue {
    public static void main(String[] args) {
        //Estrutura de repetição continue
        for (int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                continue;
            
                System.out.println(numero);
        }
    }
}
