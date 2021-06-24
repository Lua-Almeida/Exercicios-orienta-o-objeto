package exercicio;

import java.util.Scanner;

public class TesteTurma {
	

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		 String n,c;
		 int q,s;
		 
		 
		 System.out.print("digite o nome");
		 n=entrada.nextLine();
		 
		 System.out.print("digite o curso");
		 c=entrada.nextLine();
		 
		 System.out.print("digite a quantidade de alunos");
		 q=entrada.nextInt();
		 
		 System.out.print("digite a serie");
		 s=entrada.nextInt();
		 
		 
		 Turma turma = new Turma(n,c,q,s);
		 System.out.println(turma.toString());
		 
		 System.out.println("--------------------------------------------------------");
		 
		 System.out.print("digite um novo nome: ");
		 n=entrada.next();
		 
		 System.out.print("digite um novo curso: ");
		 c=entrada.next();
		 
		 System.out.print("digite uma nova quantidade de alunos: ");
		 q=entrada.nextInt();
		 
		 System.out.print("digite uma nova serie: ");
		 s=entrada.nextInt();
		 
		 turma.setNome(n);
		 turma.setCurso(c);
		 turma.setQuantidadeDeAlunos(q);
		 turma.setSerie(s);
		 
		 System.out.println(turma.toString());
		 

	}

}
