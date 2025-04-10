/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author joaoapassos
 */
public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String data;
    private String rg;
    
    Funcionario(String nome, String departamento, double salario, String data, String rg){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.data = data;
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getData() {
        return data;
    }

    public String getRg() {
        return rg;
    }
    
    void recebeAumento(float aumento){
        this.salario += aumento;
    }
    
    float calculaGanhoAnual(){
        return (float) this.salario*12;
    }
}
