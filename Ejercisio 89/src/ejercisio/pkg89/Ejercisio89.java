package ejercisio.pkg89;

import java.util.Scanner;

public class Ejercisio89 {
    
    public static void main(String[] args) {
        {
	System.out.println("    PROGRAMA NUMERO 89  ");
	int num1;
	int factorial;
	System.out.println("Digite el numero para hallar su factorial ");
            Scanner x = new Scanner(System.in);
            num1=x.nextInt();
	
	factorial = fact(num1);
	
	System.out.println("El numero factorial de:"+num1+" es: "+factorial);

        }
     }

    /**
     *
     * @param num
     * @return
     */
    public static int fact(int num)
    {
     int fact=1;
     int i;
     for(i=1;i<=num;i++)
	{
		fact=fact*i;
        }
    return fact;
 }
}
