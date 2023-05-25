package lab01;

public class Imovel {
    int nQuartos;
    int nBanheiros;
    boolean temGaragem;
    String endereco;
    boolean aluguel;
    double valorVenda;

    public void imprimeDados()
    {
        StringBuilder sb = new StringBuilder(); // Montando a string de uma maneira eficiente
        sb.append("Dados do Imovel:\n");
        sb.append("\tEndereco: " + this.endereco + "\n");
        sb.append("\tNumero de quartos: " + this.nQuartos + "\n");
        sb.append("\tNumero de banheiros: " + this.nBanheiros + "\n");
        sb.append("\tTem garagem: " + this.temGaragem + "\n");
        sb.append("\tEsta para aluguel: " + this.aluguel + "\n");
        sb.append("\tValor de venda: " + this.valorVenda);
        System.out.println(sb.toString());
    }

    public double calculaImpostos()
    {
        return this.aluguel ? this.valorVenda * 0.10 : this.valorVenda * 0.15; // Operador ternário
    }

    public void valoriza(double perc)
    {
        this.valorVenda += this.valorVenda * perc;
    }
}
