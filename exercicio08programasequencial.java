package br.com.generation.aula01;

import java.util.Scanner;

/* O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do 
 * distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do 
 * distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica 
 * de um carro e escreva o custo ao consumidor. */
public class exercicio08programasequencial {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double custoDeFabrica, custoDoConsumidor , percentagemDist , imposto;
		
		System.out.println("Escreva o valor de f�brica do carro:");
		custoDeFabrica = ler.nextDouble();
		
		percentagemDist = (custoDeFabrica*0.28);
		imposto =(custoDeFabrica*0.45);
		custoDoConsumidor=(percentagemDist + custoDeFabrica + imposto);
		
		System.out.println("O custo de Fabrica � de:R$ "+ custoDeFabrica);
		System.out.println("O custo de imposto ser� de:R$ "+ imposto);
		System.out.println("O custo do consumidor � de:R$ "+ custoDoConsumidor);
	}
}
