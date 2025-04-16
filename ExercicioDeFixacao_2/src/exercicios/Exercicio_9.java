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
public class Exercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int A[][] = {{2, -1, 5}, {7, 3, 10}, {-5, 1, 2}};
        int MINMAX = 0;
        int x = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(A[i][j] > MINMAX){
                    MINMAX = A[i][j];
                    x = i;
                }
            }
        }
        for (int k = 0; k < 2; k++) {
            //System.out.println(A[x][k]);
            if(A[x][k] < MINMAX){
                MINMAX = A[x][k];
                //System.out.println(A[i][k]);
            }
        }
        
        System.out.print("A = {");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("{");
            for (int j = 0; j < 3; j++) {
                    System.out.print(", " + A[i][j]);
            }
            System.out.print("}");
        }
        System.out.print("}");
        
        System.out.println("\nMINIMAX = " + MINMAX);
    }
}
