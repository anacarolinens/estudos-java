//Hierarquia de exceções
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        //Runtime Exeception
        //Number valor = Double.valueOf("a1.75"); //aqui a exceção não é tratada, não é obrigatório seu tratamento, mas é mostrada uma lista com exceções ao executar

        //exception handling
        //Number valor = NumberFormat.getInstance().parse("a1.75"); //aqui a possivel exceção tem que ser tratada obrigatoriamente/ imediatamente
        //Exceção tratada
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
