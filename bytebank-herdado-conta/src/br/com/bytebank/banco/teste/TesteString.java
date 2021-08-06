package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Mario ";
		String outro = "Alura";
		int i = 3;

		char c = nome.charAt(i - 1);
		int pos = nome.indexOf("rio");
		
		if(nome.isEmpty()== false) {
			System.out.println("dados inseridos!");
		}else {
			System.out.println("dados faltando!");
		}
		
		for(int u = 0; u < nome.length(); u++) {
			System.out.println(nome.charAt(u));
		}
		String novo1 = outro.toLowerCase();
		String novo2 = outro.toUpperCase();
		String novo3 = outro.replace('A', 'a');
		String sub = nome.substring(1);

		System.out.println("   ");
		System.out.println(pos);
		System.out.println("  ");
		System.out.println(c);
		System.out.println("      ");
		System.out.println(novo1 + " " + novo2 + " " + novo3 + " " + sub);
		
	
	}

}
