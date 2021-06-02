package br.com.generation.aula01;

import java.util.Scanner;

/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
 * P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
 * d = raizquradada de(x2-x1)² + (y2-y1)²
 *  */
public class exercicio06programasequencial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x1,x2,y1,y2,d,raiz;
		
		System.out.println("Qual o valor de X1:");
		x1= ler.nextDouble();
		
		System.out.println("Qual o valor de Y1:");
		y1= ler.nextDouble();
		
		System.out.println("Qual o valor de X2:");
		x2= ler.nextDouble();
		
		System.out.println("Qual o valor de Y2:");
		y2= ler.nextDouble();
		
		d = ((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));
		raiz = Math.sqrt(d);
		
		System.out.println("O valor de D é: "+d);
	}
}
