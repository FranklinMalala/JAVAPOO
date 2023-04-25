package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class ProgramaTempoDeVida {
	
	public static void main(String[] args) {
		
		int idade1;
		int idade2;
		int idade3;
		int idade4;
		int idade5;
		int idade6;
		int soma;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("digite a idade do colega idade");
		idade1 = sc.nextInt();
		
		System.out.println("digite a idade do colega idade");
		idade2 = sc.nextInt();
		
		System.out.println("digite a idade do colega idade");
		idade3 = sc.nextInt();
	
		System.out.println("digite a idade do colega idade");
		idade4 = sc.nextInt();
	
		System.out.println("digite a idade do colega idade");
		idade5 = sc.nextInt();
		
		System.out.println("digite sua idade");
		idade6 = sc.nextInt();
		sc.close();
		
		soma = idade1 + idade2 + idade3 + idade4 + idade5 + idade6;
		
		System.out.println("o tempo de vida dos meus colegas é " + soma);
		
	
	}

}
