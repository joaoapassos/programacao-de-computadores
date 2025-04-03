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
        int VET[] = {73,2,3,73,5,7,7,8,9,11,11,12,13,13,23,16,51,18,20,20};
        int VET2[] = new int[20];
        int tmp;
        
        JOptionPane.showMessageDialog(null, "Questão 4");
        
        int a = 0;
        
        for(int i = 0; i<20; i++){
            
            tmp = 1;
            
            for(int j = 0; j<20; j++){
                if((VET[i] == VET[j]) && (i!=j)){
                    tmp = 0;
                }
            }
            if(tmp==1){
                VET2[a] = VET[i];
                a++;
            }
        }
        
        System.out.println("\n");
        for(int i = 0; i<20; i++){
            System.out.print(VET[i] + ", ");
        }
        System.out.println("\n");
        for(int i = 0; i<20; i++){
            System.out.print(VET2[i] + ", ");
        }
        System.out.println("\n");
        
    }
    
}
