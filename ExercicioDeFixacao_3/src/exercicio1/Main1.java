/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author joaoapassos
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Alunos matriculados");
        
        Student[] s = new Student[1];
        
        for(int i = 0; i < s.length; i++){
            s[i] = new Student(JOptionPane.showInputDialog("Matricula do aluno " + i + ": "), JOptionPane.showInputDialog("Nome do aluno " + i + ": "));
        }
        
        for(int i = 0; i < s.length; i++){

            do{
                s[i].setProva1(Float.parseFloat(JOptionPane.showInputDialog("Nota da prova 1 do aluno " + i + ": ")));
            }while(s[i].getProva1() < 0 || s[i].getProva1() > 10);
            
            do{
                s[i].setProva2(Float.parseFloat(JOptionPane.showInputDialog("Nota da prova 2 do aluno " + i + ": ")));
            }while(s[i].getProva2() < 0 || s[i].getProva2() > 10);
            
            do{
                s[i].setTrabalho(Float.parseFloat(JOptionPane.showInputDialog("Nota do trabalho do aluno " + i + ": ")));
            }while(s[i].getTrabalho() < 0 || s[i].getTrabalho() > 10);
        }
        
        for(int i = 0; i < s.length; i++){
            JOptionPane.showMessageDialog(null, "Nome: " + s[i].getName() + "\nMatricula: " + s[i].getMatricula());
            JOptionPane.showMessageDialog(null, "Notas: prova 1: " + s[i].getProva1() + "\nprova 2: " + s[i].getProva2() + "\ntrabalho: " + s[i].getTrabalho());
            JOptionPane.showMessageDialog(null, "Media das avaliacoes: " + s[i].Media());
     
            if(s[i].Media() < 6.0f){
                JOptionPane.showMessageDialog(null, "O aluno precisa tirar na recuperacao " + s[i].Rec() + " para passar na media");
            }            
        }
    }
    
}
