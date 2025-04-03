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
public class Exercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int v1[] = new int[6];
        int v2[] = new int[6];
        int v3[] = new int[6];
        int numero;
        
        System.out.print("Informe o primeiro numero com ate 5 digitos: ");
        
        numero = sc.nextInt();
            
        for(int i = 5; i>0; i--){
            v1[i] = numero%10;
            numero = numero/10;
        }        
        
        System.out.print("\nInforme o segundo numero com ate 5 digitos: ");
        
        numero = sc.nextInt();
        
        for(int i = 5; i>0; i--){
            v2[i] = numero%10;
            numero = numero/10;
        }  
        
        System.out.print("\nV1: ");
        for(int i = 0; i<6; i++){
            System.out.print(" " + v1[i]);
        }
        System.out.print("\nV2: ");
        for(int i = 0; i<6; i++){
            System.out.print(" " + v2[i]);
        }
        System.out.println("\n--------------------------");
        
        for(int i = 5; i>0; i--){
            numero = v1[i] + v2[i];
            if(numero>9){
                v3[i] += numero%10;
                numero = numero/10;
                v3[i-1] += numero;
            }else{
                v3[i] += numero;
            }
        }
        
        System.out.print("V3: ");
        for(int i = 0; i<6; i++){
            System.out.print(" " + v3[i]);
        }
        
        System.out.println("\n");
        
    }
    
}
