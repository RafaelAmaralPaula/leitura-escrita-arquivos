package com.lovelacetecnologia.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lovelacetecnologia.arquivo.Arquivo;

public class Main {
	
	public static void main(String[] args) {
		
		Arquivo aq  = new Arquivo();
		Scanner teclado = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		
		boolean continua = true ;
		
		
		System.out.println("Cadastro De Clientes:");
		
		while (continua) {
			
			System.out.println("Nome Cliente : ");
			String nome = teclado.nextLine();
			
			lista.add(nome);
		}
		
		System.out.println("Deseja Continuar S/N");
		continua = teclado.next().equalsIgnoreCase("Sim");
		
		teclado.close();
	}	
	
	
}
