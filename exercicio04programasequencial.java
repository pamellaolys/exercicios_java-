package br.com.generation.aula01;

import java.util.Scanner;

/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) 
 * e calcule a seguinte express�o: D=R+S/2, onde R=(A+B)�  S=(B+C)�*/
public class exercicio04programasequencial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a,b,c,r,s,d;
		
		System.out.println("Escreva o valor de A: ");
		a = ler.nextDouble();
		System.out.println("Escreva o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Escreva o valor de C: ");
		c = ler.nextDouble();
		
		r= Math.pow(a, b);
		s= Math.pow(b, c);
		d= (r+s)/2;
		System.out.println("O resultado de D �: "+d);
	}
}
