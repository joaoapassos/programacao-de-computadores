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

public class Exercicio_6 {
    
    public static float adicao(float n1, float n2){
        float res;
        res = n1 + n2;
        return res;
    }
    public static float subtracao(float n1, float n2){
        float res;
        res = n1 - n2;
        return res;
    }
    public static float divisao(float n1, float n2){
        float res;
        res = n1 / n2;
        return res;
    }
    public static float multiplicacao(float n1, float n2){
        float res;
        res = n1 * n2;
        return res;
    }
    
    public static void main(String []args){
        float num1, num2, adi, div, sub, mult;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com num1: ");
        num1 = sc.nextFloat();
        System.out.print("Entre com num2: ");
        num2 = sc.nextFloat();
        
        adi = adicao(num1, num2);
        sub = subtracao(num1, num2);
        div = divisao(num1, num2);
        mult = multiplicacao(num1, num2);
        
        //System.out.println(num1 + " + " + num2 + " = " + adi);
        //System.out.println(num1 + " - " + num2 + " = " + sub);
        //System.out.println(num1 + " / " + num2 + " = " + div);
        //System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.printf("\n%.1f + %.1f = %.1f", num1, num2, adi);
        System.out.printf("\n%.1f - %.1f = %.1f", num1, num2, sub);
        System.out.printf("\n%.1f * %.1f = %.1f", num1, num2, mult);
        System.out.printf("\n%.1f / %.1f = %.1f\n", num1, num2, div);
    }
}
