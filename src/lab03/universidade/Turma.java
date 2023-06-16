package lab03.universidade;

import java.util.ArrayList;

public class Turma {
    private int numAlunos;

    private int numMonitores;

    private Professor professor;

    private ArrayList<Monitor> monitores;

    private ArrayList<Aluno> alunos;

    /**
     * Default constructor
     */
    public Turma() {
        this.numAlunos = 0;
        this.numMonitores = 0;
        this.professor = new Professor();
        this.monitores = new ArrayList<Monitor>();
        this.alunos = new ArrayList<Aluno>();
    }

    /**
     * @param professor
     * @param monitores
     * @param alunos
     */
    public Turma(Professor professor, ArrayList<Monitor> monitores, ArrayList<Aluno> alunos) {
        this.professor = professor;

        if (alunos.size() < 5) {
            throw new IllegalArgumentException("Turma deve ter no mínimo 5 alunos");
        } else if (alunos.size() > 35) {
            throw new IllegalArgumentException("Turma deve ter no máximo 35 alunos");
        }
        this.numAlunos = alunos.size();
        this.alunos = alunos;

        if (monitores.size() > 3) {
            throw new IllegalArgumentException("Turma deve ter no máximo 3 monitores");
        }
        this.numMonitores = monitores.size();
        this.monitores = monitores;
    }

    /**
     * @param professor
     * @param alunos
     */
    public Turma(Professor professor, ArrayList<Aluno> alunos) {
        this.professor = professor;

        if (alunos.size() < 5) {
            throw new IllegalArgumentException("Turma deve ter no mínimo 5 alunos");
        } else if (alunos.size() > 35) {
            throw new IllegalArgumentException("Turma deve ter no máximo 35 alunos");
        }
        this.numAlunos = alunos.size();
        this.alunos = alunos;

        this.numMonitores = 0;
        this.monitores = new ArrayList<Monitor>();
    }

    /**
     * @return the numAlunos
     */
    public int getNumAlunos() {
        return numAlunos;
    }

    /**
     * @return the numMonitores
     */
    public int getNumMonitores() {
        return numMonitores;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * 
     * @param monitores the monitores to set
     */
    public void setMonitores(ArrayList<Monitor> monitores) {
        if (monitores.size() > 3) {
            throw new IllegalArgumentException("Turma deve ter no máximo 3 monitores");
        }
        this.numMonitores = monitores.size();
        this.monitores = monitores;
    }

    /**
     * @return the monitores
     */
    public ArrayList<Monitor> getMonitores() {
        return monitores;
    }

    /**
     * 
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        if (alunos.size() < 5) {
            throw new IllegalArgumentException("Turma deve ter no mínimo 5 alunos");
        } else if (alunos.size() > 35) {
            throw new IllegalArgumentException("Turma deve ter no máximo 35 alunos");
        }
        this.numAlunos = alunos.size();
        this.alunos = alunos;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public boolean adicionaAluno(Aluno aluno) {
        if (this.numAlunos > 35) {
            return false;
        }
        this.alunos.add(aluno);
        this.numAlunos++;
        return true;
    }

    public boolean removeAluno() {
        if (this.numAlunos < 5) {
            return false;
        }
        this.alunos.remove(this.numAlunos - 1);
        this.numAlunos--;
        return true;
    }

    public void imprimeAlunos() {
        for (Aluno aluno : this.alunos) {
            aluno.imprime();
        }
    }
}
