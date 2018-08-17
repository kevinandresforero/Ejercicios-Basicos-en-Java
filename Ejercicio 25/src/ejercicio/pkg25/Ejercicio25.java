
package ejercicio.pkg25;

import java.util.Scanner;



public class Ejercicio25 {

  
    public static void main(String[] args) {
     
        System.out.println("Introduzca tres numeros en orden creciente");
        int x1,y1,z1,v;
        Scanner x=new Scanner(System.in);
         x1=x.nextInt();
        Scanner y=new Scanner(System.in);
         y1=x.nextInt();
        Scanner z=new Scanner(System.in);
         z1=x.nextInt(); 
       
	if(z1>y1 && y1>x1)
	{
	System.out.println("Los actuales numeros son crecientes");
	}
	else
	{
	System.out.println("Los actuales numeros no son crecientes");
	}
    }
    
}
