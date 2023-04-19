package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		ArrayList<String> view = new ArrayList<>();
		
		for(int x=0;x<5;x++ ) {
		
		System.out.println("\nDigite uma cor: ");
		String cor = leia.nextLine();
		view.add(cor);
		
		}
		
		 System.out.println("\nCores escolhidas: \n");
	        for (int x = 0; x < view.size(); x++) {
	            System.out.println(view.get(x));
		
		 }
	     Collections.sort(view);
	     
	     
	     System.out.println("\nOrdenando as cores: \n");
	     	for(int x =0; x < view.size(); x++) {
	     		System.out.println(view.get(x));
	     	}
	        
	}

}
