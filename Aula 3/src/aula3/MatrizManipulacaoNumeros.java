/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3034712
 */
public class MatrizManipulacaoNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matriz[][] = new int[2][3];
        String str = "";
        for(int i = 0; i<matriz.length; i++){
            str = str + "\n";
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matriz["+i+"]["+j+"]: "));
                str = str + " " + matriz[i][j];
            }
        }
                
        JOptionPane.showMessageDialog(null, str);       

        
    }
    
}
