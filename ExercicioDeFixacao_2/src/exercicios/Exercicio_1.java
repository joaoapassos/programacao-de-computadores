/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3034712
 */
public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    
    public static int RESTO(int var, int var2){
        //JOptionPane.showMessageDialog(null, var);
        //JOptionPane.showMessageDialog(null, var%var2);
        
        int  res = var%var2;
        
        /*if(res <= 6 || res >= 0){
            if(res%1 >= 0.5f){
                res = res + 1 - res%1;
            }else {
                res = res - res%1;
            }
        }else if(res > 6){
            res = res - 6;
        }*/
        
        //JOptionPane.showMessageDialog(null, res);

        return res;
    }
    
    public static int TRUNCA(float var){
        return (int)var;
    }
    
    public static int QUOCIENTE(int var, int var2){
        return (int)(var/var2);
    }
    
    public static int CORRIGIR(int var){
        int position[] = {0,3,4,5,6,7,8,9,10,11,12,1,2};
        int i = 1;
        do{
            i++;  
        }while(var != position[i]);
        
        //System.out.println(var + " - " + i);
        
        /*switch (var){
            case 1 -> var = 11;
            case 2 -> var = 12;
            case 3 -> var = 1;
            case 4 -> var = 2;
            case 5 -> var = 3;
            case 6 -> var = 4;
            case 7 -> var = 5;
            case 8 -> var = 6;
            case 9 -> var = 7;
            case 10 -> var = 8;
            case 11 -> var = 9;
            case 12 -> var = 10;
        }*/
        return i;
    }
    
    public static void main(String[] args) {
        int D, A, S, diaDaSemana, M;
        JOptionPane.showMessageDialog(null, "Descubra dia da semana apartir de uma data qualquer!");
        D = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Dia: "));
        M = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Mes: "));
        A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Ano: "));
        
        M = CORRIGIR(M);
        //System.out.println(M);
        if(M == 11 || M == 12){
            A--;
        } 
        //System.out.println(M + " - " + A);
        
        
        S = A/100;
        
        A = A%100;
        
        
        
        diaDaSemana = RESTO((TRUNCA((float)(2.6 * M - 0.1)) + D + A + QUOCIENTE(A, 4) + QUOCIENTE(S, 4) - 2 * S), 7);
        
        //if(A%4 != 0){
        //    diaDaSemana = diaDaSemana + 1;
        //}
        
        switch(diaDaSemana){
            case 0 -> JOptionPane.showMessageDialog(null, "Dia da semana e Domingo");
            case 1 -> JOptionPane.showMessageDialog(null, "Dia da semana e Segunda");
            case 2 -> JOptionPane.showMessageDialog(null, "Dia da semana e Terca");
            case 3 -> JOptionPane.showMessageDialog(null, "Dia da semana e Quarta");
            case 4 -> JOptionPane.showMessageDialog(null, "Dia da semana e Quinta");
            case 5 -> JOptionPane.showMessageDialog(null, "Dia da semana e Sexta");
            case 6 -> JOptionPane.showMessageDialog(null, "Dia da semana e Sabado");
            default -> JOptionPane.showMessageDialog(null, "Erro");
        }
            
        
    }
    
}
