package collectionArrayList;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class exArraylist2 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		List<Integer> num = new ArrayList<Integer>();
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		
		System.out.println("\nDigite um número inteiro: ");
		int i = leia.nextInt();
		
		boolean verifica;
        verifica = num.contains(i);

        if(verifica == true) {
            System.out.println("\nO número "+i+" foi encontrado na posição "+num.indexOf(i)+"");
        }else {
            System.out.println("\nO número "+i+" não foi encontrado!");
        }
	}

}
