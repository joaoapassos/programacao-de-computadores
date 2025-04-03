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
        int res, horaC, minC, horaS, minS;
        float valor = 0;
        
        
        JOptionPane.showMessageDialog(null, "Questão 3");
        
        horaC = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora de chegada : "));
        minC = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto de chegada : "));
        horaS = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora de saida : "));
        minS = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto de saida : "));
        
        if((horaC > horaS) || (horaC == horaS && minC > minS)){
            horaS += 24;
        }
        
        float tempoMinutos = (horaS*60 + minS) - (horaC*60 + minC);
        
        tempoMinutos = tempoMinutos/60;
        
        if((tempoMinutos - (int)tempoMinutos) > 0.0f){
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
        
        JOptionPane.showMessageDialog(null, "Valor cobrado: R$" + valor + ", por " + res + " horas");
        
    }
    
}