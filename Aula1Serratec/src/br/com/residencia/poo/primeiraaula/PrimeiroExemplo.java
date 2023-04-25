package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class PrimeiroExemplo {
	
	public static void main(String[] args) {
		String nome, sobrenome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("digite seu nome");
		nome = sc.next();
		
		
		System.out.println ("digite seu sobrenome");
		sobrenome = sc.next();
		sc.close();
		
		System.out.println ("olá" + nome +" "+ sobrenome);
	}

}
