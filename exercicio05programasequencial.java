package br.com.generation.aula01;
/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
 *  Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/

import java.util.Scanner;

public class exercicio05programasequencial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1,n2, n3;
		double p1,p2,p3, media;
		
		System.out.println("Escreva o valor da primeira nota: ");
		n1 = ler.nextDouble();
		
		System.out.println("Insira o peso da primeira nota: ");
		p1 = ler.nextDouble();
		
		System.out.println("Escreva o valor da segunda nota: ");
		n2 = ler.nextDouble();
		
		System.out.println("Insira o peso da segunda nota: ");
		p2 = ler.nextDouble();
		
		System.out.println("Escreva o valor da primeira nota: ");
		n3 = ler.nextDouble();
		
		System.out.println("Insira o peso da primeira nota: ");
		p3 = ler.nextDouble();
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("A média do aluno é: " + media);
	}
}
