package br.com.generation.aula01;

/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;
public class Exercicio01programasequencial {

	public static void main(String[]args) {
		
	Scanner ler = new Scanner(System.in);
	int anos, meses, dias, idadeEmdias;
	
	System.out.println("quantos anos voc� tem: ");
	anos = ler.nextInt();
	
	System.out.println("quantos meses voc� tem: ");
	meses = ler.nextInt();
	
	System.out.println("quantos dias voc� tem: ");
	dias = ler.nextInt();
	
	idadeEmdias = ((anos*365)+(meses*30) + dias) ;
	
	System.out.println("Idade em dias: "+ idadeEmdias);
	
	}
}
