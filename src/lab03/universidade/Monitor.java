package lab03.universidade;

public class Monitor {
    private int id;

    private boolean temExperiencia;

    /**
     * Default constructor
     */
    public Monitor() {
        this.id = -1; // Assumimos que o id é -1
        this.temExperiencia = false; // Assumimos que não tem experiência
    }

    /**
     * @param id
     * @param temExperiencia
     */
    public Monitor(int id, boolean temExperiencia) {
        this.id = id;
        this.temExperiencia = temExperiencia;
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
     * @return the temExperiencia
     */
    public boolean isTemExperiencia() {
        return temExperiencia;
    }

    /**
     * @param temExperiencia the temExperiencia to set
     */
    public void setTemExperiencia(boolean temExperiencia) {
        this.temExperiencia = this.temExperiencia || temExperiencia; // Não perde a experiência
    }
}
