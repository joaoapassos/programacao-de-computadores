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
public class Exercicio_3 {
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        double premio, sena, quina, quadra;
        int pSena, pQuina, pQuadra;
        
        System.out.print("Qual o valor do premio: ");
        premio = sc.nextFloat();
        
        System.out.println("Entre com numeros de participantes que ganhou sena: ");
        pSena = sc.nextInt();
        System.out.println("Entre com numeros de participantes que ganhou quina: ");
        pQuina = sc.nextInt();
        System.out.println("Entre com numeros de participantes que ganhou quadra: ");
        pQuadra = sc.nextInt();
        
        sena = premio*0.6;
        quina = premio*0.3;
        quadra = premio*0.1;
        
        System.out.println("Valor completo do premio: R$" + premio);
        System.out.println("Valor completo de sena: R$" + sena);
        System.out.println("Numero de vecendores do sena: " + pSena + " - Valor por participante: R$" + sena/pSena);
        System.out.println("Valor completo de quina: R$" + quina);
        System.out.println("Numero de vecendores do quina: " + pQuina + " - Valor por participante: R$" + quina/pQuina);
        System.out.println("Valor completo de quadra: R$" + quadra);
        System.out.println("Numero de vecendores do quadra: " + pQuadra + " - Valor por participante: R$" + quadra/pQuadra);
           
    }
    
}