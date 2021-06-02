package br.com.generation.aula01;

import java.util.Scanner;
public class EntradaSaida {
	
//Programa de Entrada e Saída
	//Programa: Aula01
	//A10utor: Pamella de Oliveira Santos
	//Data: 02/06/21
	
	public static void main(String []args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b, soma;
		
		System.out.println("Escreva o valor de A:");
		a = entrada.nextInt();
		
		System.out.println("Escreva o valor de B:");
		b = entrada.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma dos dois numeros é: "+soma);
        
		entrada.close();
	} 
}
