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
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    
    public static int tempoDeJogo(int hIn, int mIn, int hFi, int mFi){
        int res = (hFi*60 + mFi) - (hIn*60 + mIn );
        
        return res;
    }
    
    public static void main(String[] args) {
        int horaIn, horaFi, minIn, minFi, res;
        JOptionPane.showMessageDialog(null, "Questão 2");
        
        do{
            horaIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Hora de Inicio"));
            minIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Minuto de Inicio"));
            horaFi = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Hora de termino"));
            minFi = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe Minuto de termino"));
        }while(horaIn>horaFi || (horaIn==horaFi && minIn>minFi));
        
        res = tempoDeJogo(horaIn, minIn, horaFi, minFi);
        
        JOptionPane.showMessageDialog(null, "Tempo de jogo em minutos é: " + res);
        
    }
    
}
