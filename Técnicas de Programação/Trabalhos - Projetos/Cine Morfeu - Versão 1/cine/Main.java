package cine;

import java.util.ArrayList;


import cine.bilheteria.Bilheteria;
import cine.bilheteria.Filme;

public class Main {
    public static void main(String[] args) {
        
        Bilheteria bilheteria = new Bilheteria();
        System.out.println("---------------------INIT-------------------");
        
        bilheteria.cadastrarFilme("Maverick", "tom cruise fodao", 120, "acao", 20);
        bilheteria.cadastrarFilme("Wanda-vision", "wanda pirada no jiraia", 120, "acao", 20);
        int[][] grid = new int [8][8];
        for(int[] row : grid){
            for(int square : row){
               System.out.print(square + " ");
            }
            System.out.println();
       }

        ArrayList<Filme> filmes = bilheteria.getAllFilmes();
        

        bilheteria.setFilmeNaSala(bilheteria.getSalaBasica(), filmes.get(0));

        System.out.println(bilheteria.getSalaBasica().getFilme().getNome());

      

    }
}
