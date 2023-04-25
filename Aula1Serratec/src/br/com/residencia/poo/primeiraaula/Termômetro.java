package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class Termômetro {
	
	public static void main(String[] args) {
		
		double celcius;
		double fahrenheit;
		double arredondar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a temperatura atual em graus Celscius");
		
		celcius = sc.nextDouble();
		
		fahrenheit = (celcius * 1.8) + 32;
		
		arredondar = Math.round(fahrenheit * 10)/ 10;
		
		
		System.out.println("a temperatura atual em Fahrenheit é : " + arredondar);
		
		
		
		
		
		
		
	}

}

