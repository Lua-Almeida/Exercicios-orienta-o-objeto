package exercicio;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
	
		Scanner entrada=new Scanner(System.in);
		 String n;
		 double p;
		 int q;
		 
		 
		 System.out.print("digite o nome do produto: ");
		 n=entrada.nextLine();
		 
		 System.out.print("digite o preço: ");
		 p=entrada.nextDouble();
		 
		 System.out.print("digite a quantidade: ");
		 q=entrada.nextInt();
		 
		 
		 
		 Produto produto = new Produto(n,p,q);
		 
		 System.out.println(" ");
		 System.out.println(produto.toString());

	}

}
