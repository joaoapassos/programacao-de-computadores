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
public class Exercicio_4 {
    public static void main(String []args){
        float C, i, J, M, pres;
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculando prestacao de um imovel");
        System.out.println("Forneca o capital inicial: ");
        C = sc.nextInt();
        System.out.println("Forneca a taxa de juros: ");
        i = sc.nextInt();
        System.out.println("Forneca o tempo de aplicacao: ");
        t = sc.nextInt();
        
        J = C*(i/100)*t;
        M = C+J;
        pres = M/t;
        
        System.out.println("Valor do imovel cheio: " + M + ", Valor de uma prestacao: " + pres);
        
        System.exit(0);//Funciona como o return no Java
    }
}
