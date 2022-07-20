package Loja;

public class Main {

	public static void main(String[] args) {

		Pendrive p1 = new Pendrive();
		p1.valor=100;
		p1.memoria=32;
		p1.marca= "K";
		
		Pendrive p2= p1.duplicar2();
		
		System.out.println(p1.marca + " "+ p2.marca);
		
//		Pendrive p2 = new Pendrive();
//		p2.valor=100;
//		p2.memoria=32;
//		p2.marca= "K";
//		
//		NotaFiscal nota= new NotaFiscal();
//		nota.item.add(p1);
//		nota.item.add(p2);
//		
//		Impressora i = new Impressora();
//		nota.item.add(i);
//		
//		System.out.println(nota.item.size());
//		
		
		
	

}
}
