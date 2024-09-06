package main;

import controle.Controle;
import model.Aluno;
import model.Funcionarios;
import model.Menu;
import model.Turma;


public class Main 
{
    public static void main (String[] args) 
    {
        Controle controle = new Controle();
        
        Turma t = new Turma("Informatica", "terceiro");
        Aluno a = new Aluno("vitor", "3738", "18/04/2005", t);
        Funcionarios f = new Funcionarios("Jonas", "111.111.111-11", 10.000);
        
        controle.cadastrarAluno(a.getMatricula(), a);
        controle.cadastrarTurma(t.getCurso(), t);
        controle.cadastrarFuncionarios(f.getCpf(), f);
        
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
