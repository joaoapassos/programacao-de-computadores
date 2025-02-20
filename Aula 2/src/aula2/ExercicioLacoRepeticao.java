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
public class ExercicioLacoRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f, n, num;
        
        JOptionPane.showMessageDialog(null, "Calculo do fatorial");
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero: "));
        f = 1;
        
        for(n=num; n >=1; n--){
           f = f * n;
        }
        
        JOptionPane.showMessageDialog(null, num + "! = " + f);
    }
    
}
