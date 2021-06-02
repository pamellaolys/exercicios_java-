package br.com.generation.aula01;

import java.util.Scanner;

/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
 * distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do 
 * distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica 
 * de um carro e escreva o custo ao consumidor. */
public class exercicio08programasequencial {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double custoDeFabrica, custoDoConsumidor , percentagemDist , imposto;
		
		System.out.println("Escreva o valor de fábrica do carro:");
		custoDeFabrica = ler.nextDouble();
		
		percentagemDist = (custoDeFabrica*0.28);
		imposto =(custoDeFabrica*0.45);
		custoDoConsumidor=(percentagemDist + custoDeFabrica + imposto);
		
		System.out.println("O custo de Fabrica é de:R$ "+ custoDeFabrica);
		System.out.println("O custo de imposto será de:R$ "+ imposto);
		System.out.println("O custo do consumidor é de:R$ "+ custoDoConsumidor);
	}
}
