/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author joaoa
 */
public class Exercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num2=0, i;
        Random rd = new Random();
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um numero entre 1 e 99"));
        
        for(i = 1; num2 != num; i++){
            num2 = rd.nextInt(100-1) + 1;
            System.out.println(num2);
        }
        
        JOptionPane.showMessageDialog(null, "O bot leveou " + i + " Tentativas ate acertar o numero que digitou: \n" + num);
    }
    
}
