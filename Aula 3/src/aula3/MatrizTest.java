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
public class MatrizTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        String str[] = 
                {
                    "Linha um",
                    "Linha dois",
                    "Linha tres",
                    "Linha quatro",
                    "Linha cinco"
                };
        for(i=0; i<str.length; i++){
            JOptionPane.showMessageDialog(null, "String" + (i+1) + ": " + str[i]);
        }
        
        for(i=0; i<5; i++){
            for(j = 0; j<str[i].length(); j++){
                JOptionPane.showMessageDialog(null, "char [" + i + "] = " + str[i].charAt(j));
            }
        }
    }
    
}
