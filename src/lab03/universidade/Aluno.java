package lab03.universidade;
/*
 * 15/06/2023
 * Laboratório 3 -  Relacionamento entre Classes
 * Ian Kersz Amaral
 * Modulo da classe Aluno
*/

public class Aluno {
    private int id;

    private float indiceDesempenho;
    static final private float notaMax = 10.0f;
    static final private float notaMin = 0.0f;

    /**
     * Default constructor
     */
    public Aluno() {
        id = -1; // Assumimos que o id é -1
        indiceDesempenho = notaMin; // Assumimos que o índice de desempenho é 0.0
    }

    /**
     * @param id
     * @param indiceDesempenho
     */
    public Aluno(int id, float indiceDesempenho) {
        // Não foi estipulado, portanto removi
        // if (id < 0) {
        // throw new IllegalArgumentException("Id deve ser maior ou igual a 0");
        // }
        this.id = id;

        boolean valorNegativo = indiceDesempenho < notaMin;
        boolean valorMaiorQueMaximo = indiceDesempenho > notaMax;
        if (valorNegativo || valorMaiorQueMaximo) {
            throw new IllegalArgumentException("Indice de desempenho deve estar entre " + notaMin + " e " + notaMax);
        }

        this.indiceDesempenho = indiceDesempenho;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        // Não foi estipulado, portanto removi
        // if (id < 0) {
        // throw new IllegalArgumentException("Id deve ser maior ou igual a 0");
        // }
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the indiceDesempenho
     */
    public float getIndiceDesempenho() {
        return indiceDesempenho;
    }

    public boolean aumentaIndiceDesempenho(float valor) {
        boolean valorNegativo = valor < notaMin;
        boolean valorMaiorQueMaximo = valor > notaMax;
        boolean somaMaiorQueDez = valor + indiceDesempenho > notaMax;
        if (valorNegativo || valorMaiorQueMaximo || somaMaiorQueDez) {
            return false;
        }

        indiceDesempenho += valor;
        return true;
    }

    public boolean diminuiIndiceDesempenho(float valor) {
        boolean valorNegativo = valor < notaMin;
        boolean valorMaiorQueMaximo = valor > notaMax;
        boolean subtracaoMenorQueMinimo = indiceDesempenho - valor < notaMin;
        if (valorNegativo || valorMaiorQueMaximo || subtracaoMenorQueMinimo) {
            return false;
        }

        indiceDesempenho -= valor;
        return true;
    }

    public boolean imprime() {
        System.out.println("Aluno: " + id + " - Indice de desempenho: " + indiceDesempenho);
        return true;
    }

}
