package lab01;
/*
 * 25/05/2023
 * Laboratório 1 - POO
 * Ian Kersz Amaral
 * Programa Principal para os testes
*/

public class ProgramaPrincipal {
    public static void main(String[] args) {
        //! Parte 1
        // Criação do objeto
        Imovel im1; // Declaração de variável do tipo Imovel
        im1 = new Imovel(); // Instanciação de um objeto do tipo Imovel

        // Atribuição de valores aos atributos
        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.endereco = "Rua dos Fulanos, n. 0";
        im1.aluguel = true;
        im1.valorVenda = 142000;

        // Teste dos métodos
        im1.imprimeDados();
        im1.valoriza(0.025); // 0.025 = 2.5%
        im1.imprimeDados();
        System.out.println("Impostos: " + im1.calculaImpostos());

        //! Parte 2
        // Criação do objeto
        Imovel im2 = new Imovel();

        // Atribuição dos mesmos valores
        im2.nQuartos = im1.nQuartos;
        im2.nBanheiros = im1.nBanheiros;
        im2.temGaragem = im1.temGaragem;
        im2.endereco = im1.endereco; //! Ler abaixo
        /* Como String não é mutável, não há problema em fazer isso, 
        já que se mudarmos im1.endereco ele apontara para outro lugar e deixara esse exatamente como antes, 
        mas os dois apontam para o mesmo endereço de memória
        */
        im2.aluguel = im1.aluguel;
        im2.valorVenda = im1.valorVenda;

        if(im1 == im2)
            System.out.println("Mesmos imoveis!");
        else
            System.out.println("Imoveis distintos");

        /*
         * O que acontece?
         * R: O resultado é "Imoveis distintos", pois im1 e im2 são variáveis 
         * com endereços de memória distintos, mesmo que os valores dos atributos
         * Isso acontece pois, já que a classe Imovel não implementa a interface
         * Comparable, o operador == compara os endereços de memória dos objetos
        */

        //! Parte 3
        // Criação do objeto
        Imovel im3 = im1;
        im3.valorVenda = 0;
        im3.imprimeDados();
        im1.imprimeDados();
        /*
         * O que acontece?
         * R: O resultado é que o valor de venda de im1 é alterado para 0, pois
         * im3 é uma variável que aponta para o mesmo endereço de memória que im1.
         * Assim, quando alteramos o valor de venda de im3, alteramos o valor da 
         * variavel que im3.valorVenda aponta, que é o mesmo que im1.valorVenda aponta.
        */
    }
}
