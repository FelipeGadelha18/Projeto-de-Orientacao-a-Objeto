
package Model;

import java.util.HashMap;

/**
 *
 * @author Aluno
 */
public class Usuario 
{
    private String nome = "default";
    private String email = "default";
    private String usuario = "default";
    private String senha = "default";
    
    public Usuario(){}
        
    public Usuario(String nome,String email,String usuario,String senha)
    {
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public String getSenha()
    {
        return this.senha;
    }
    public String getEmail()
    {
        return this.email;
    }
    
    
        
}
