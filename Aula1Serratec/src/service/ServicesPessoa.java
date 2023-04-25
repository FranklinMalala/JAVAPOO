package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Aulas.model.Pessoa;

public class ServicesPessoa {
	
	List<Pessoa> pessoa = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void inserirPessoa() {
		System.out.println("Digite as informações requitadas para adicionar a pessoa!!");
		String nome = sc.next();
		int idade = sc.nextInt();
		pessoa.add(new Pessoa(nome,idade));
	}

	public static void main(String[] args) {
		ServicesPessoa servicesPessoa = new ServicesPessoa();
		
		servicesPessoa.inserirPessoa();
	}
	
}
