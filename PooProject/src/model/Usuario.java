/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Usuario{
    private String id;
    private String senha;
    
    public Usuario(String id, String senha)
    {
        this.id = id;
        this.senha = senha;
    }
    
    public Usuario()
    {
        this.id = "user";
        this.senha = "12345";
    }
    
    public void setAutenticacao(String id, String senha)
    {
        this.id = id;
        this.senha = senha;
    }
    
    public String getId()
    {
        return this.id;
    }
    public String getSenha()
    {
        return this.senha;
    }
}
