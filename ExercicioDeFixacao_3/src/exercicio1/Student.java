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
    private float media;
    
    float Media(float p1, float p2, float t){
        float md = (p1*2.5f + p2*2.5f + t*2)/7;
        return md;
    }
    
    float Rec(float media){
        float res = 0;
        if(media>5.9f){
            System.out.println("A media do aluno supera 5.9, portanto nao ha recuperacao");
        }
        else{
            res = 6.0f - media;
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
    
    public void setMedia(float media) {
        this.media = media;
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

    public float getMedia() {
        return media;
    }

    
        
    
}
