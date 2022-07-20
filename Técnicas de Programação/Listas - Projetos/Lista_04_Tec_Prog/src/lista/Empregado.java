package lista;

import java.util.Scanner;

public class Empregado {
	String nome;
	String sobrenome;
	double salarioMensal;
	
	public Empregado() {
		
		
		System.out.println("Digite um nome:");
		setNome(entrada());
		getNome();
		
		System.out.println("Digite um sobrenome:");
		setSobrenome(entrada());
		getSobrenome();
		
		System.out.println("Digite um salario:");
		setSalarioMensal(entradaSalario());
		if(salarioMensal <= 0) {
			salarioMensal = 0.0;
		}
		getSalarioMensal();
		
		double salarioAnual = salarioAnual(salarioMensal);
		double salarioAumento = salarioAumento(salarioMensal);
				
		System.out.print("Nome completo: ");
		System.out.println(getNome() + " " + getSobrenome());
		System.out.print("Salario: ");
		System.out.println(getSalarioMensal() + "R$ ao mes e " + salarioAnual + " R$ ao ano");
		System.out.println();
		System.out.print("Salario com 10% de aumento: ");
		System.out.println(salarioAumento);
		 
	}
	
	public String entrada() {
		Scanner entrada = new Scanner(System.in);
		String string = entrada.nextLine();
		return string;
	}
	
	public int entradaSalario() {
		Scanner entrada = new Scanner(System.in);
		int salario = entrada.nextInt();
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(int salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public double salarioAnual(double salarioMensal) {
		double salarioAnual = salarioMensal * 12;
		return salarioAnual;
	}
	
	public double salarioAumento(double salarioMensal) {
		double salarioAumento = salarioMensal + (salarioMensal * 0.1);
		return salarioAumento;
	}
	
	
	
}
