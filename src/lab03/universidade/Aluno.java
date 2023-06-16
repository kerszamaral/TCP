package lab03.universidade;

public class Aluno {
    private int id;

    private float indiceDesempenho;

    /**
     * Default constructor
     */
    public Aluno() {
        id = -1; // Assumimos que o id é -1
        indiceDesempenho = 0.0f; // Assumimos que o índice de desempenho é 0.0
    }

    /**
     * @param id
     * @param indiceDesempenho
     */
    public Aluno(int id, float indiceDesempenho) {
        if (id < 0) {
            throw new IllegalArgumentException("Id deve ser maior ou igual a 0");
        }
        this.id = id;

        boolean valorNegativo = indiceDesempenho < 0.0f;
        boolean valorMaiorQueDez = indiceDesempenho > 10.0f;
        if (valorNegativo || valorMaiorQueDez) {
            throw new IllegalArgumentException("Indice de desempenho deve estar entre 0.0 e 10.0");
        }

        this.indiceDesempenho = indiceDesempenho;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id deve ser maior ou igual a 0");
        }
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
        boolean valorNegativo = valor < 0.0f;
        boolean valorMaiorQueDez = valor > 10.0f;
        boolean somaMaiorQueDez = valor + indiceDesempenho > 10.0f;
        if (valorNegativo || valorMaiorQueDez || somaMaiorQueDez) {
            return false;
        }

        indiceDesempenho += valor;
        return true;
    }

    public boolean diminuiIndiceDesempenho(float valor) {
        boolean valorNegativo = valor < 0.0f;
        boolean valorMaiorQueDez = valor > 10.0f;
        boolean subtracaoMenorQueZero = indiceDesempenho - valor < 0.0f;
        if (valorNegativo || valorMaiorQueDez || subtracaoMenorQueZero) {
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
