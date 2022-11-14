import java.util.*;
public class Exemplo2While {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int step = 0;
        while (num > 0 )
        {
            if (num % 2 == 0)//par
            {
              num = num / 2;
              step++;
            }
            else { //impar
            num  = num - 1;
            step++;
            }
        }

	if(step > num){
	    System.out.println(step);
	}else{
	    System.out.println(num);
	}
    }
}