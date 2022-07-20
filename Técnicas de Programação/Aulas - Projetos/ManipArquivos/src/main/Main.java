package main;

public class Main {
	public static void main(String[] args) {

		Leitura ler= new Leitura();
		//caminho relativo
		ler.ler("dados/teste.txt");
		//ler.imprimir();
		
		Escrita escrever= new Escrita();
		escrever.escrever("Vamos para o trabalho 2","teste2.txt" );
//		
//		String caminho2="../../../SenhorDoCafes/Apresentacao/Menu.java";
//		
//		//caminho absoluto
//		//ler.ler("C:/Users/Fischer_PC/Documents/Aulas_UFC/TécnicasDeProgramação/workspace/ManipArquivos/teste2.tecProg");
//		
//		Escrita e = new Escrita();
//		String caminho="dados/teste2.txt";
//		for (int i = 0; i < 10; i++) {
//			String msg= "msg"+i;
//			e.escrever(msg, caminho);
//				
//		}
//		
		
	   System.out.println("\n\n Fim do programa");
	}
}
