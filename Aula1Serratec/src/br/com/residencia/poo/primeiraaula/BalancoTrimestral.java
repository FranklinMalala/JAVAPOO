package br.com.residencia.poo.primeiraaula;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int total;
		
		GastosDoMes gastosJaneiro = new GastosDoMes();
		GastosDoMes gastosFevereiro = new GastosDoMes();
		GastosDoMes gastosMarco = new GastosDoMes();
		
		gastosJaneiro.setValor(15000);
		gastosFevereiro.setValor(23000);
		gastosMarco.setValor(17000);
		
		
		total = gastosJaneiro.RetornaValor(gastosJaneiro.getValor(), gastosFevereiro.getValor(), gastosMarco.getValor());
		
		System.out.println(total);	
		
		
		
	}
}
