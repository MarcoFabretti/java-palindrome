package org.generation.italy.strings;
import java.util.Scanner;
public class VerificaPalindorme {

	public static void main(String[] args) {
		Scanner cIn = new Scanner(System.in);
		boolean v=true;
		char[] parola;
		System.out.println("Inserire una parola da verificare se palindorma: ");
		do {
			System.out.println("Ricorda che la parola deve essere para.");
		parola = cIn.next().toCharArray();
		}while(parola.length%2!=0);
		
		
		
		int j=parola.length-1;	
		for(int i=0; i<parola.length; i++) {
				if(!(parola[i]==parola[j])) {
					v=false;
				}
			j--;
		}
		
		
		
		
		
		if(v==false) {
			System.out.println("la parola non � palindorma");
		}else System.out.println("la parola � palindorma");
	cIn.close();
	}
}
