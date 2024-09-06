package model;

import Interface.Autenticavel;

public class Aluno extends Usuario implements Autenticavel{
    private String nome;
    private String matricula;
    private String dataNascimento;
    private Turma turma;

    public Aluno(String nome, String matricula, String dataNascimento) 
    {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.turma = new Turma("", "");
        
    }
    
    public Aluno(String nome, String matricula, String dataNascimento, Turma turma) 
    {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
    }
    
    public Aluno(String nome, String matricula, String dataNascimento, Turma turma, String id, String senha) 
    {
        super(id, senha);
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
    }
    
    public Aluno(String nome, String matricula, String dataNascimento, String id, String senha) 
    {
        super(id, senha);
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.turma = new Turma("", "");
    }
    
    @Override
    public boolean autenticar(String id, String senha)
    {
        return super.getId() == id && this.getSenha() == senha;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public String getRelatorio()
    {
        String s = "";
        s += "Nome: " + this.nome + "\n";
        s += "Matricula: " + this.matricula + "\n";
        s += "Turma: " + "\n";
        s += "      " + this.turma.getRelatorio();
        return s;
    }
        
}
