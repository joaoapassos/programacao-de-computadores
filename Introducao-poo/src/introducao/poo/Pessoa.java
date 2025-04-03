/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao.poo;

/**
 *
 * @author cg3034712
 */
public class Pessoa {
    private String nome;
    private int idade;
    //String nacionalidade;
    //String profissao;
    
    Pessoa(){
        System.out.println("Inserindo uma pessoa");
    }
    
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
}
