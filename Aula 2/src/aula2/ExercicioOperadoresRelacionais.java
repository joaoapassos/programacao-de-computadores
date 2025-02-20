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
public class ExercicioOperadoresRelacionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int r=0;
        
        nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        JOptionPane.showMessageDialog(null, "Bem-vindo(a) " + nome + "!");
        
        r = JOptionPane.showConfirmDialog(null, "Seu nome esta correto?");
        
        switch (r) {
            case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Errado!");
            case JOptionPane.YES_OPTION -> JOptionPane.showMessageDialog(null, "Correto!");
            default -> JOptionPane.showMessageDialog(null, "Valor indefinido");
        }
    }
    
}
