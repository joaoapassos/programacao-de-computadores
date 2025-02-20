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
public class Exercicio_5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num, tmp, i=100;
        int num2=0;
        do{
            System.out.print("Entre com um numero inteiro de 3 digitos: ");
            num = sc.nextInt();
        }while(num<100 || num>999);
        tmp = num;
        while(tmp>0){
            
            num2 = num2 + (tmp%10)*i;//2
            tmp = tmp/10;
            i = i/10;

            
        }
        if(num2<10){
            System.out.println("Num: " + num + "\nNum2: " + "00" + num2 );
        }else if(num2<100){
            System.out.println("Num: " + num + "\nNum2: " + "0" + num2);
        }else System.out.println("Num: " + num + "\nNum2: " + num2);
    }
}
