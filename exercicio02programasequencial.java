package br.com.generation.aula01;
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a 
 * expressa em anos, meses e dias. */

import java.util.Scanner;

public class exercicio02programasequencial {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses,dias;
		System.out.println("Escreva quantos dias voce viveu: ");
		dias = ler.nextInt();

		anos = (dias/365);
		meses =(dias/30);
		
		System.out.println("A quantidade de anos que você já viveu foi de: " + anos);
		System.out.println("A quantidade de meses que você já viveu foi de: " + meses);
	}

}
