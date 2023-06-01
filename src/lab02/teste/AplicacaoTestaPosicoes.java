package lab02.teste;
/*
 * 25/05/2023
 * Laboratório 1 - POO
 * Ian Kersz Amaral
 * Programa principal
*/
import java.util.ArrayList;
import java.util.Scanner;

import lab02.posicoes.PosicaoMapa4x4;

public class AplicacaoTestaPosicoes {
    private static int MAP_WIDTH = 4;
    private static int MAP_HEIGHT = 4;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //* Posicao 1
        PosicaoMapa4x4 p1 = new PosicaoMapa4x4();
        
        System.out.print("Digite a posição do objeto no mapa (x, y) entre 1 e 4: ");
        while(!p1.setX(sc.nextInt() - 1) || !p1.setY(sc.nextInt() - 1))
            System.out.println("Posicao invalida, tente novamente");
        
        p1.imprime();
        System.out.println();

        //* Posicao 2
        PosicaoMapa4x4 p2 = new PosicaoMapa4x4();

        System.out.print("Digite a posição do objeto no mapa (x, y) entre 1 e 4: ");
        while (!p2.setX(sc.nextInt() - 1) || !p2.setY(sc.nextInt() - 1))
            System.out.println("Posicao invalida, tente novamente");

        p2.imprime();
        System.out.println();

        System.out.println("Distancia entre os objetos: " + p1.distancia(p2));

        System.out.println();

        //* Posicao 3 (copia de p1)        
        PosicaoMapa4x4 p3 = p1.copy();

        //* Testando o overlap
        System.out.println("Overlap entre p1 e p2: " + PosicaoMapa4x4.estaoMesmaPosicao(p1, p2));

        System.out.println("Overlap entre p2 e p3: " + PosicaoMapa4x4.estaoMesmaPosicao(p2, p3));

        System.out.println("Overlap entre p1 e p3: " + PosicaoMapa4x4.estaoMesmaPosicao(p1, p3));

        System.out.println();

        //* Posicao Mostrando o mapa
        ArrayList<PosicaoMapa4x4> posicoesOcupadas = new ArrayList<PosicaoMapa4x4>();
        posicoesOcupadas.add(p1);
        posicoesOcupadas.add(p2);
        posicoesOcupadas.add(p3);

        System.out.println("Mapa 4x4:");
        imprimeMapa(posicoesOcupadas);

        sc.close();
    } 

    private static void imprimeMapa(ArrayList<PosicaoMapa4x4> posicoesOcupadas){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < MAP_HEIGHT; i++){
            for(int j = 0; j < MAP_WIDTH; j++){
                sb.append("[   ]");
                for (PosicaoMapa4x4 posicaoMapa : posicoesOcupadas) {
                    if(posicaoMapa.getX() == j && posicaoMapa.getY() == i)
                        sb.replace(1, 4, " X ");
                }
                System.out.print(sb.toString());
                sb.setLength(0);
            }
            System.out.println();
        }
    }
}