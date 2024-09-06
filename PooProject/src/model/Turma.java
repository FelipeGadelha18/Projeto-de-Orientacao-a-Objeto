package model;

public class Turma {
    private String curso;
    private String serieSemestre;

    public Turma(String curso, String serieSemestre) {
        this.curso = curso;
        this.serieSemestre = serieSemestre;
    }

    public String getCurso() {
        return curso;
    }

    public String getSerieSemestre() {
        return serieSemestre;
    }
    
    public String getRelatorio()
    {
        String s = "";
        s += "Curso: " + this.curso + "\n";
        s += "      Semestre: " + this.serieSemestre;
        return s;
    }
}
