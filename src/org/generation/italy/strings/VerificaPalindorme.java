package org.generation.italy.strings;
import java.util.Scanner;
public class VerificaPalindorme {

	public static void main(String[] args) {
		Scanner cIn = new Scanner(System.in);
		boolean v=true;
		char[] parola;
		System.out.println("Inserire una parola da verificare se palindorma: ");
		
		
		
		parola = cIn.next().toCharArray();
		
		
		
		int j=parola.length-1;	
		
		
		
		for(int i=0; i<parola.length; i++) {
				if(!(parola[i]==parola[j])) {
					v=false;
				}
			j--;
		}
		
		
		if(v==false) {
			System.out.println("la parola non è palindorma");
		}else System.out.println("la parola è palindorma");
	cIn.close();
	}
}
