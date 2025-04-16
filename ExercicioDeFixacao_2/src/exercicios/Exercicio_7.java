/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author cg3034712
 */
public class Exercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int v1[] = new int [25];
        int v2[] = new int [25];
        
        int array1[] = {1,2,3,4,5,6,7,8,9,10};
        int array2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,11};
        
        System.arraycopy(array1, 0, v1, 0, array1.length);
        
        System.arraycopy(array2, 0, v2, 0, array2.length);
        
        
        int test = 1;
        for(int i = 0; i < v2.length; i++){
            for (int j = 0; j < v1.length; j++) {
                if(v1[j] == v2[i]){
                    test = 0;
                }    
            }
            if(test==1){
                int j = 0;
                do{                 
                    j++;
                }while(v1[j] != '\0');
                
                if(v1[j] == '\0'){
                    System.out.println("Entrou2");
                    v1[j] = v2[i];
                }
            }
            test = 1;
        }
      
        System.out.print("V1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i]);
        }
        System.out.print("\nV2:");
        for (int i = 0; v2[i] != '\0'; i++) {
            System.out.print(" " + v2[i]);
        }
        System.out.print("\nV1:");
        for (int i = 0; v1[i] != '\0'; i++) {
            System.out.print(" " + v1[i]);
        }
        System.out.print("\n");      
    }
    
}
