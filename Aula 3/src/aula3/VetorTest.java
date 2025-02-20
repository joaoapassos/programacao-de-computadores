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
public class VetorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = new int[5];
        int aux = 0, i;
        
        JOptionPane.showMessageDialog(null, "Entre com 5 numeros: ");
        
        for(i=0; i<5; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "vetor[" + i + "]: "));
            
            if(i == 0){
                aux = vetor[0];
            }else if(vetor[i] >= aux){
                aux = vetor[i];
            }
           
        }
        
        JOptionPane.showMessageDialog(null, "Maior numero: " + aux);    
    }
    
}
