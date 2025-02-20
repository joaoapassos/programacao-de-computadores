/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;
/**
 *
 * @author joaoa
 */
public class Exercicio_2 {
    
    public static void main(String []args){
        int anos, meses, dias, res;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade em anos, meses e dias:");
        System.out.println("Anos: ");
        anos = sc.nextInt();
        System.out.println("Meses: ");
        meses = sc.nextInt();
        System.out.println("Dias: ");
        dias = sc.nextInt();
        
        res = anos*365 + meses*30 + dias;
        
        System.out.println("Sua idade expressa em dias e: " + res + " dias");
    }
    
}
