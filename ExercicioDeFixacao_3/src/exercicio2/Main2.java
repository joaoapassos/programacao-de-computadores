/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author joaoapassos
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joao", "Designer", 3000, "11/02/2024", "123456789-9");
        
        System.out.println("Nome: " + f.getNome() + "\nDepartamento: "+ f.getDepartamento() + "\nSalario: "+ f.getSalario() + "\nData: "+ f.getData() + "\nRG: " + f.getRg());
        
        System.out.println("Ganho anual: " + f.calculaGanhoAnual());
        
        f.recebeAumento(500);
        
        System.out.println("Salario: " + f.getSalario());
        
        System.out.println("Ganho anual: " + f.calculaGanhoAnual());
        
        
        
    }
    
}
