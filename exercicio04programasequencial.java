package br.com.generation.aula01;

import java.util.Scanner;

/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
 * e calcule a seguinte expressão: D=R+S/2, onde R=(A+B)²  S=(B+C)²*/
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
		System.out.println("O resultado de D é: "+d);
	}
}
