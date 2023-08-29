package estrutura_repetitiva;

import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite as idades:");
      int x= sc.nextInt();
      int soma;
      int media;
      int cont;
      
      x= sc.nextInt();
      
      if ( x < 0) { 
    	  System.out.println("IMPOSSIVEL CALCULAR");
      }
	  else {
		 soma = 0;
		 cont = 0;
	  
      
      while(x >= 0) {
    	  
    	  soma += x;
    	  cont = cont + 1;   
    	  
    	  x= sc.nextInt();
    	      	     	  
      }
      
      media = soma / cont;
	  System.out.println("MEDIA = " + media);
	  
	  }
    
    sc.close();

	}

}
