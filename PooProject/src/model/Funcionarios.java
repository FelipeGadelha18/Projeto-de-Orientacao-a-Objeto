/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;
import Interface.Autenticavel;

public class Funcionarios extends Usuario implements Autenticavel{ 
    private String nome;
    private String cpf;
    private double salario;
    private double cargaHoraria;
    
    public Funcionarios(String nome, String cpf, double salario)
    {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargaHoraria = 00.0;
    }
    
    public Funcionarios(String nome, String cpf, double salario, double cargaHoraria)
    {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    
    public Funcionarios(String nome, String cpf, double salario, double cargaHoraria, String id, String senha)
    {
        super(id, senha);
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public boolean autenticar(String id, String senha)
    {
        return super.getId() == id && this.getSenha() == senha;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
    
    public String getRelatorio()
    {
        String s = "";
        s += "Nome: " + this.nome + "\n";
        s += "Cpf: " + this.cpf + "\n";
        s += "Carga Horaria: " + this.cargaHoraria + "\n";
        s += "Salario: " + this.salario + "\n";
        
        return s;
    }
        
}
