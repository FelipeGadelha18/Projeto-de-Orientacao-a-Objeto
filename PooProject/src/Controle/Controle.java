/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class Controle {
    private Set<String> aulas;
    private HashMap<String, Integer> Presenca = new HashMap<String, Integer>();
    private HashMap<String, Double> Notas = new HashMap<String, Double>();
    
    public void adicionarAula(String diaHora)
    {
        aulas.add(diaHora);
    }
    
    public void adicionarPresenca(String nome, int presenca)
    {
        this.Presenca.put(nome, presenca);
    }
    
    public void adicionarNota(String nome, Double nota)
    {
        this.Notas .put(nome, nota);
    }
    
    
}
