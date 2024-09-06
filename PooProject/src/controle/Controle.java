/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.HashMap;
import java.util.Map;
import model.Aluno;
import model.Funcionarios;
import model.Turma;


public class Controle 
{
    private static HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
    private static HashMap<String, Funcionarios> funcionarios = new HashMap<String,Funcionarios>();
    private static HashMap<String, Turma> turmas = new HashMap<String, Turma>();
    
    public Map<String, Aluno> getAlunos()
    {
        return alunos;
    }
    
    public Map<String, Funcionarios> getFuncionarios()
    {
        return funcionarios;
    }
    
    public Map<String, Turma> getTurmas()
    {
        return turmas;
    }
    
    public void cadastrarAluno(String matricula, Aluno aluno)
    {
        Controle.alunos.put(matricula, aluno);
    }
    
    public void cadastrarFuncionarios(String cpf, Funcionarios func)
    {
        Controle.funcionarios.put(cpf, func);
    }
    
    public void cadastrarTurma(String curso, Turma turma)
    {
        Controle.turmas.put(curso, turma);
    }
       
    public String listarAlunos()
    {
        String s = "";
        for(Aluno a : alunos.values())
        {
            s += a.getRelatorio();
            s += "\n";
        }
        return s;
    }
        
}
