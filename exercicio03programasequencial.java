package br.com.generation.aula01;

import java.util.Scanner;

/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

public class exercicio03programasequencial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int minutos, segundos , horas;
		
		System.out.println("Escreva quantos segundos durou seu evento: ");
		segundos = ler.nextInt();
		
		minutos = (segundos/60);
		horas =  (minutos/60);
		
		System.out.println("Os minutos de dura��o do seu evento foram de: "+ minutos);
		System.out.println("As horas de dura��o do seu evento foram de: "+ horas);
	}
}
