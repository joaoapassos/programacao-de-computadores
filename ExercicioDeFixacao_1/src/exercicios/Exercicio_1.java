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
public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        float c=0, f=0;    
        System.out.println("Informe a temperatura em F: ");    
        f = sc.nextInt();        
        c = 5 / 9f * (f-32);//Usa se f depois do 9 pois ele esta calculando em int e nao em flout
        System.out.printf("De F: %.2f para C: %.2f\n", f, c);
        
        System.exit(0);//Funciona como o return é feito para sair de uma função 
    }
    
}
