package br.com.generation.aula01;

import java.util.Scanner;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

public class exercicio03programasequencial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int minutos, segundos , horas;
		
		System.out.println("Escreva quantos segundos durou seu evento: ");
		segundos = ler.nextInt();
		
		minutos = (segundos/60);
		horas =  (minutos/60);
		
		System.out.println("Os minutos de duração do seu evento foram de: "+ minutos);
		System.out.println("As horas de duração do seu evento foram de: "+ horas);
	}
}
