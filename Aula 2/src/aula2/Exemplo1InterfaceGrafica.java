/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3034712
 */
public class Exemplo1InterfaceGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        
        nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) " + nome + "!");
    }
    
}
