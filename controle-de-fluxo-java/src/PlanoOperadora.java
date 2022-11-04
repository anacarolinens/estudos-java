public class PlanoOperadora {
    public static void main(String[] args) {
         //Variáveis
         String plano = "T";

         //Condicional Swith case sem break
         switch (plano){ 
             case "T":{
                 System.out.println("5Gb Youtube");
             }
             case "M":{
                 System.out.println("Whatsapp e Instagram grátis");
             }
             case "B":{
                 System.out.println("100 minutos de ligação");
             }
         }
    }
}
