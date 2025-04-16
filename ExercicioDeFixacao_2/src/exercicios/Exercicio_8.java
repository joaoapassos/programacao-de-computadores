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
public class Exercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tamanho = 10;
        int v1[] = new int [11];
        int array[] = {10,2,5,7,1,6,9,3,4,8,0};
        int tmp = 0;
        
        System.arraycopy(array, 0, v1, 0, array.length);
        
        System.out.println("V1 nao ordenado:");
        for (int i = 0; v1[i] != '\0'; i++) {
            System.out.print(" " + v1[i]);
        }
        
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1.length; j++) {
                if(v1[i] > v1[j]){
                    tmp = v1[j];
                    v1[j] = v1[i];
                    v1[i] = tmp;
                }
            }
        }
        //System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            tmp = v1[i];
            v1[i] = v1[tamanho-i];
            v1[tamanho-i] = tmp;
            //System.out.println(v1[i] + " " + v1[tamanho-i]);
            
        }
        
        System.out.println("\nV1 ordenado:");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(" " + v1[i]);
        }
        System.out.println("\n");
        
    }
}
