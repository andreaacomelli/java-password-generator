package org.lessons.java.security;

import java.util.*;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome ");
		
		String nome = input.nextLine();
		
		System.out.println("Inserisci il tuo Cognome ");
		
		String cognome = input.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito ");
		
		String colore = input.nextLine();
		
		System.out.println("Inserisci il tuo giorno di nascita ");
		
		int giorno = input.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita ");
		
		int mese = input.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita ");
		
		int anno = input.nextInt();
		
		
		int sommaDataNascita = giorno + mese + anno;
		
		String password = nome + "-" + cognome + "-" + colore + "-" + sommaDataNascita;
		
		System.out.println(password);
		
	}

}