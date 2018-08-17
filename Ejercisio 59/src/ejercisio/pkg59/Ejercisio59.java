package ejercisio.pkg59;

import java.util.Scanner;

public class Ejercisio59 {
    public static void main(String[] args) {
        System.out.println("    PROGRAMA NUMERO 59  ");
	int Arreglo[] = new int [5];
	Scanner Lector = new Scanner(System.in);
        int suma=0;
	int media;
        
 
 System.out.println("  Porfavor ingrese 5 numeros  ");

  for(int i=0;i<5;i++){
  	System.out.print("Numero->");
        Arreglo[i] = Lector.nextInt();
  	suma=suma+Arreglo[i];
  }
  media=suma/5;
  System.out.println("La media de los numeros correspondientes es: "+media);
    }
}