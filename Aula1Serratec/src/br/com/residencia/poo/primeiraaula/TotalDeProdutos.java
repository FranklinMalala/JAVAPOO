package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class TotalDeProdutos {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos produtos ira comprar\n");
		
		x = sc.nextInt();
		sc.close();
		
		
		
		System.out.println("Parabéns por comprar "+ x + " produtos!!");
	
		
		
	}
}
