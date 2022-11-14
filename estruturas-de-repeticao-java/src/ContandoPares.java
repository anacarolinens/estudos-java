// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;
 
public class ContandoPares
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++){
            if (num % 2 == 0){
                count++;
            }
        int sum = 0;
        for (int j = 0; j < sum; j++){
            sum = sum + num;
        }
        if ((sum %  2) == 0)
            {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }

}
