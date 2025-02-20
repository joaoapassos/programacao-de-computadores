/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacote1;
import java.util.Scanner;
/**
 *
 * @author cg3034712
 */
public class Aula1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p1=0, p2=0, nf=0, mp1=0, mp2=0;
        do{
            System.out.print("Qual o peso da nota P1: ");
            mp1 = sc.nextFloat();
        }while(mp1>=10);
        mp2 = 10 - mp1;
        System.out.println("Peso percentual das notas: P1 - " + mp1*10 + "% e P2 - " + mp2*10 + "%");
           
        do{
            System.out.print("Nota 1: ");
            p1 = sc.nextFloat();
        }while(p1>10);
        do{
            System.out.print("Nota 2: ");
            p2 = sc.nextFloat();
        }while(p2>10);
        
        nf = (p1*mp1 + p2*mp2)/10;
        
        System.out.println("Nota final: " + nf);
    }
    
}
