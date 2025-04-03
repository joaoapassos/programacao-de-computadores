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
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chegada[] = new int[4];
        int partida[] = new int[4];
        int tmp, res;
        float valor = 0;
        
        
        JOptionPane.showMessageDialog(null, "Questão 3");
        
        res = Integer.parseInt(JOptionPane.showInputDialog(null, "Horario de chegada [hhmm]: "));
        tmp = res;
        for(int i = chegada.length-1; i>0; i--){
            if(tmp<10){
                 chegada[i] = tmp;
             }else {
                 chegada[i] = tmp%10;
             }
             
             tmp = (int)(tmp*0.1);
        }
        res = Integer.parseInt(JOptionPane.showInputDialog(null, "Horario de partida [hhmm]: "));
        tmp = res;
        for(int i = partida.length-1; i>0; i--){
            if(tmp<10){
                 partida[i] = tmp;
             }else {
                 partida[i] = tmp%10;
             }
             
             tmp = (int)(tmp*0.1);
        }
        
        
        
        float tempoMinutos = ((partida[0]*10 + partida[1])*60 + partida[2] + partida[3]) - ((chegada[0]*10 + chegada[1])*60 + chegada[2] + chegada[3]);
        
        tempoMinutos = tempoMinutos/60;
        
        if(tempoMinutos - (int)tempoMinutos > 0.0f){
            res = (int)tempoMinutos+1;
        }else res = (int)tempoMinutos;
        
        for(int i = 1; i<=res; i++){
            if(i==1 || i==2){
                valor += 1;
            }
            else if(i==3 || i==4){
                valor += 1.4f;
            }
            else if(i>4){
                valor += 2;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Valor cobrado: R$" + valor + ", por " + res + "horas");
        
    }
    
}
