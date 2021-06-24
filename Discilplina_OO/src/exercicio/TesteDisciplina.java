package exercicio;

import java.util.Scanner;

public class TesteDisciplina {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		 String n,np;
		 int s;
		 boolean o;
		 
		 
		 System.out.print("digite o nome da discplina: ");
		 n=entrada.nextLine();
		 
		 System.out.print("digite o nome do professor: ");
		 np=entrada.nextLine();
		 
		 System.out.print("digite o semestre: ");
		 s=entrada.nextInt();
		 
		 System.out.print("ofertada: ");
		 o=entrada.nextBoolean();
		 
		 
		Disciplina disciplina = new Disciplina(n,np,s,o);
		 
		 System.out.println(" ");
		 System.out.println(disciplina.toString());

	}

}
