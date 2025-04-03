/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questoes;


import javax.swing.JOptionPane;

/**
 *
 * @author cg3034712
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
 
    public static int quadrado(int n){
        int res = n*n;
        return res;
    }
    public static int cubo(int n){
        int res = n*n*n;
        return res;
    }
    public static int quarta(int n){
        int res = n*n*n*n;
        return res;
    }
    
    public static void main(String[] args) {
         
         int num = 0, res = 0;
         JOptionPane.showMessageDialog(null, "Questão 1");
         
         do{
             num = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um numero de até 4 digitos: "));
         }while(num>9999);
         
         int tmp[] = new int[4];
         
         int i = tmp.length-1;
         int a = num;
         //System.out.println(a);
         while(i>0){
             if(a<10){
                 tmp[i] = a;
             }else {
                 tmp[i] = a%10;
             }
             
             a = (int)(a*0.1);
             
             i--;
         }
         
         i = tmp.length-1;
         if(num>9 && num<100){
             while(i>0){
                 res += quadrado(tmp[i]); 
                 i--;
             }
         }else if(num>99 && num<1000){
             while(i>0){
                 res += cubo(tmp[i]);
                 System.out.println(tmp[i]);
                 System.out.println(res);
                 i--;
             }
         }else if(num>999){
             while(i>0){
                 res += quarta(tmp[i]);
                 i--;
             }
         }else{
             JOptionPane.showMessageDialog(null, num + " é um numero de Armstrong");
         }
         
         if(res==num){
             JOptionPane.showMessageDialog(null, num + " é um numero de Armstrong");
         }else{
             JOptionPane.showMessageDialog(null, num + " não é um numero de Armstrong");
         }
    }
    
}
