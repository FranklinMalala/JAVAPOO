package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		int escolha_do_usuario = 0;
		float num1;
		float num2;
		float soma;
		float subtracao;
		float multiplicacao;
		float divisao;
		
		System.out.println("Escolha o que quer fazer :\n 1- soma\n 2- subtracao\n 3- Multiplicar\n 4- divisao\n");
		
		Scanner sc = new Scanner(System.in);
		escolha_do_usuario = sc.nextInt();
		
		
		
		
		
		switch(escolha_do_usuario) {
		
			case 1:
				num1 = sc.nextFloat();
				num2 = sc.nextFloat();
				sc.close();
				soma =	num1 + num2;
				
				System.out.println(soma);
				
				break;
		
		
		
			case 2:
				num1 = sc.nextFloat();
				num2 = sc.nextFloat();
				sc.close();
				subtracao =	num1 - num2;
				
				System.out.println(subtracao);
				
				break;
				
				
		
			case 3:
				num1 = sc.nextFloat();
				num2 = sc.nextFloat();
				sc.close();
				multiplicacao =	num1 * num2;
				
				System.out.println(multiplicacao);
				
				break;
		
				
				
			case 4:
				num1 = sc.nextFloat();
				num2 = sc.nextFloat();
				sc.close();
				divisao =	num1 / num2;
				
				System.out.println(divisao);
				
				break;
		
		}
		
					
		
	}
	
	
	

}
