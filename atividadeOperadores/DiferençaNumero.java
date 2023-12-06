package atividadeOperadores;

import java.util.Scanner;

public class DiferençaNumero {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4 , diferenca;
		
		System.out.println("\n Entre com um primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("\n Entre com um segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("\n Entre com um terceiro valor: ");
		n3 = leia.nextFloat();
		System.out.println("\n Entre com um quarto valor: ");
		n4 = leia.nextFloat();
		
		diferenca = ((n1*n2) - (n3*n4) );
		
	    System.out.println("\n A Diferença entre valores é de : " + diferenca);
			

		

	}

}
