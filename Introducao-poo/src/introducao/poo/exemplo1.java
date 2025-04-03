/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introducao.poo;

/**
 *
 * @author cg3034712
 */
public class exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        
        p[0] = new Pessoa();
        p[0].nome = "Joao Alves";
        p[0].idade = 19;
        
        p[1] = new Pessoa(p[0].nome, p[0].idade);
        
        System.out.println(p[1].nome + "; " + p[1].idade);
    }
    
}
