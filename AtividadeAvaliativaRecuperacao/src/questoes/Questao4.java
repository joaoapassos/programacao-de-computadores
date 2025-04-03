/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questoes;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3034712
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] VET = new int[6];
        int[] VET2 = new int[20];
        int tmp;
        
        JOptionPane.showMessageDialog(null, "Questão 4");
        
        for(int i = 0; i<VET.length; i++){
            VET[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "VET[" + i + "]:"));
        }
        
        int a = 0;
        
        for(int i = 0; i<VET.length; i++){
            tmp = 1;
            for(int j = 0; VET2[j] != '\0'; j++){
                if(VET[i] == VET2[j]){
                    tmp = 0;
                }
            }
            
            if(tmp == 1){
                VET2[a] = VET[i];
                a++;
            }
        }
        
        
        for(int i = 0; VET2[i] != '\0'; i++){
              
            for(int j = 0; VET2[j] != '\0'; j++){
      
                if(VET2[i] < VET2[j]){
                        tmp = VET2[j];
                        VET2[j] = VET2[i];
                        VET2[i] = tmp;
                }
            }            
        }
        
        System.out.println("\n");
        for(int i = 0; i<VET.length; i++){
            System.out.print(VET[i] + ", ");
        }
        System.out.println("\n");
        for(int i = 0; i<VET2.length; i++){
            if(VET2[i] != '\0'){
                System.out.print(VET2[i] + ", ");
            }
        }
        System.out.println("\n");
    }
    
}
