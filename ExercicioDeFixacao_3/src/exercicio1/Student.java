/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author joaoapassos
 */
public class Student {
    private String matricula;
    private String name;
    private float prova1;
    private float prova2;
    private float trabalho;

    Student (String matricula, String nome){
        this.matricula = matricula;
        this.name = nome;
        this.prova1 = 0;
        this.prova2 = 0;
        this.trabalho = 0;
    }
    
    float Media(){
        return ((this.prova1*2.5f) + (this.prova2*2.5f) + (this.trabalho*2))/7;
    }
    
    float Rec(){
        float media = Media();
        float res = 0;
        
        if(media < 6.0f){
            res = 12.0f - media;
        }
        
        return res;        
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getName() {
        return name;
    }

    public float getProva1() {
        return prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public float getTrabalho() {
        return trabalho;
    }

    
        
    
}
