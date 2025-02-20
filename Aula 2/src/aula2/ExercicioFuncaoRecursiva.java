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
public class ExercicioFuncaoRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        JOptionPane.showMessageDialog(null, "Calculo do fatorial");
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero: "));
        
        JOptionPane.showMessageDialog(null, num + "! = " + fat(num));      
        
    }
    
    public static int fat(int num){
        int f;
        if(num>1){
            f = num * fat(num-1);
        }else{
            f = 1;
        }
            
        return f;
    }
    
}
