package lab03.universidade;

public class Professor {
    private int id;

    private String departamento;

    /**
     * Default constructor
     */
    public Professor() {
        id = -1; // Assumimos que o id é -1
        departamento = ""; // Assumimos que o departamento é vazio
    }

    /**
     * @param id
     * @param departamento
     */
    public Professor(int id, String departamento) {
        if (id < 0) {
            throw new IllegalArgumentException("Id deve ser maior ou igual a 0");
        }
        this.id = id;
        this.departamento = departamento;
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
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
