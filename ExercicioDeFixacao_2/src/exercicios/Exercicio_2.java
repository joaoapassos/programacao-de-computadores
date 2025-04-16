/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author joaoa
 */
public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    
    public static int vereficaData(int A, int M, int D){
        int res = 0;
        
        if(A >= 1500 && A <=2025){
            if(M >= 1 && M<=12){
                if(D>=1 && D<=28){
                    res=1;
                }
                else if((D==29 && M==2)&&(A%4 == 0)){
                    res=1;
                }
                else if((D>28 && D<=30)&&(M==4 || M==6 || M==9 || M==11)){
                    res=1;
                }else if((D>28 && D<=31) && (M==1 || M==5 || M==7 || M==8 || M==10 || M==12)){
                    res=1;
                }
            }
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        int D, M, A, res;
        //String data[] = new String[10];//   00/00/0000
        JOptionPane.showMessageDialog(null,"Validação de data!");
        D = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o dia"));
        M = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o mes"));
        A = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano"));
  
        
        res = vereficaData(A, M, D);
        
        if(res==0){
            JOptionPane.showMessageDialog(null,"Data nao valida!");
        }else{
            JOptionPane.showMessageDialog(null,"Data valida!");
        }
    }
    
}
