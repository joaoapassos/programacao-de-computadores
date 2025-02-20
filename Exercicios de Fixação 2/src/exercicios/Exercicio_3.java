/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author joaoa
 */
public class Exercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var, var2;
        Random rand = new Random();
        JOptionPane.showInternalMessageDialog(null, "Jakenpo!");
        var = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Pedra\n2 - Papel\n3 - Tesoura"));
        var2 = rand.nextInt(4-1)+1;
        
        System.out.println(var2);
        
        if(var == var2){
            JOptionPane.showInternalMessageDialog(null, "Empate!");
        }else if(var == 1 && var2==2){
            JOptionPane.showInternalMessageDialog(null, "Jogador perdeu!");
        }else if(var == 2 && var2==1){
            JOptionPane.showInternalMessageDialog(null, "Jogador venceu!");
        }else if(var == 3 && var2==2){
            JOptionPane.showInternalMessageDialog(null, "Jogador venceu!");
        }else if(var == 2 && var2==3){
            JOptionPane.showInternalMessageDialog(null, "Jogador perdeu!");
        }else if(var == 3 && var2==1){
            JOptionPane.showInternalMessageDialog(null, "Jogador perdeu!");
        }else if(var == 1 && var2==3){
            JOptionPane.showInternalMessageDialog(null, "Jogador venceu!");
        }
        
    }
    
}
