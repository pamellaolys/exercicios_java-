package br.com.generation.aula01;

import java.util.Scanner;

/*Um sistema de equações lineares do tipo: ax+by=c / dx+ ey=f , pode ser resolvido segundo mostrado abaixo : 
x=ce-bf/ae-bd   y=af-cd/ae-bd , Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
e calcula e mostra os valores de x e y. */
public class exercicio07programacaosequencial {

	public static void main(String[] args) {
	  
		Scanner ler = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o valor de A:");
		a= ler.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b= ler.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c= ler.nextDouble();
		
		System.out.println("Digite o valor de D:");
		d= ler.nextDouble();
		
		System.out.println("Digite o valor de E:");
		e= ler.nextDouble();
		
		System.out.println("Digite o valor de F:");
		f= ler.nextDouble();
		
		x=((c*e)-(b*f))/((a*e)-(b*d));
	    y=((a*f)-(c*d))/((a*e)-(b*d));

	    System.out.println("O valor de X é:"+x);
	    System.out.println("O valor de Y é:"+y);
	}
}
