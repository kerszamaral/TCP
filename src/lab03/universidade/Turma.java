package lab03.universidade;
/*
 * 15/06/2023
 * Laboratório 3 -  Relacionamento entre Classes
 * Ian Kersz Amaral
 * Modulo da classe Turma
*/

import java.util.ArrayList;

public class Turma {

    static final private int maxAlunosPorTurma = 35;
    static final private int minAlunosPorTurma = 5;
    private int numAlunos;

    static final private int maxMonitoresPorTurma = 3;
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

        if (alunos.size() < minAlunosPorTurma) {
            throw new IllegalArgumentException("Turma deve ter no mínimo " + minAlunosPorTurma + " alunos");
        } else if (alunos.size() > maxAlunosPorTurma) {
            throw new IllegalArgumentException("Turma deve ter no máximo " + maxAlunosPorTurma + " alunos");
        }
        this.numAlunos = alunos.size();
        this.alunos = alunos;

        if (monitores.size() > maxMonitoresPorTurma) {
            throw new IllegalArgumentException("Turma deve ter no máximo " + maxMonitoresPorTurma + " monitores");
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

        if (alunos.size() < minAlunosPorTurma) {
            throw new IllegalArgumentException("Turma deve ter no mínimo " + minAlunosPorTurma + " alunos");
        } else if (alunos.size() > maxAlunosPorTurma) {
            throw new IllegalArgumentException("Turma deve ter no máximo " + maxAlunosPorTurma + " alunos");
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
    public boolean setMonitores(ArrayList<Monitor> monitores) {
        if (monitores.size() > maxMonitoresPorTurma) {
            System.out.println("Turma deve ter no máximo " + maxMonitoresPorTurma + " monitores");
            return false;
        }
        this.numMonitores = monitores.size();
        this.monitores = monitores;
        return true;
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
    public boolean setAlunos(ArrayList<Aluno> alunos) {
        if (alunos.size() < minAlunosPorTurma) {
            // throw new IllegalArgumentException("Turma deve ter no mínimo " +
            // minAlunosPorTurma + " alunos");
            System.out.println("Turma deve ter no mínimo " + minAlunosPorTurma + " alunos");
            return false;
        } else if (alunos.size() > maxAlunosPorTurma) {
            // throw new IllegalArgumentException("Turma deve ter no máximo " +
            // maxAlunosPorTurma + " alunos");
            System.out.println("Turma deve ter no máximo " + maxAlunosPorTurma + " alunos");
            return false;
        }
        this.numAlunos = alunos.size();
        this.alunos = alunos;
        return true;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public boolean adicionaAluno(Aluno aluno) {
        if (this.numAlunos > maxAlunosPorTurma) {
            System.out.println("Turma já chegou ao máximo de alunos");
            return false;
        }
        this.alunos.add(aluno);
        this.numAlunos++;
        return true;
    }

    public boolean removeAluno() {
        if (this.numAlunos < minAlunosPorTurma) {
            System.out.println("Turma já chegou ao mínimo de alunos");
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
