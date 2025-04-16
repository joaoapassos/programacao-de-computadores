/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joaoa
 */
public class Exercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        int codigo = 0;
        char M[] = {'A','B','C','D','E','F','G','H','I','J','K','L','N','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char m[] = {'a','b','c','d','e','f','g','h','i','j','k','l','n','m','o','p','q','r','s','t','u','v','w','x','y','z'};
        char n[] = {'1','2','3','4','5','6','7','8','9','0'};
        char esp[] = {'!', '@', '#', '$', '%', '&', '*', '(', ')', '-', '+', '/', '?', ',', '.', '<', '>', ';', ':', '\\', '|'};
        JOptionPane.showMessageDialog(null, "Verificação de senha");
        
        do{
            
            senha = JOptionPane.showInputDialog(null, "Informe sua senha: ");
            
            //JOptionPane.showMessageDialog(null, "Chegou aqui");
            //Verificar quantos caracteres a string possui
            
            codigo = 0;
            
            int i = senha.length();
            
            //
            
            System.out.println(i);
            
            if(i<8){
                JOptionPane.showMessageDialog(null, "Senha com menos de 8 caracteres");
                codigo = 1;
            }
            if(codigo == 0){
                codigo = 1;
                for(int a = 0; a < i; a++){
                    for(int j = 0; j < M.length; j++){
                        if(senha.charAt(a) == M[j]){
                            codigo = 0;
                        }
                    }
                }
                
                if(codigo == 1){
                    JOptionPane.showMessageDialog(null, "Senha necessita de um caracter maiusculo");
                }
            }
            if(codigo == 0){
                codigo = 1;
                for(int a = 0; a < i; a++){
                    for(int j = 0; j < m.length; j++){
                        if(senha.charAt(a) == m[j]){
                            codigo = 0;
                        }
                    }
                }
                
                if(codigo == 1){
                    JOptionPane.showMessageDialog(null, "Senha necessita de um caracter minusculo");
                }
            }
            if(codigo == 0){
                codigo = 1;
                for(int a = 0; a < i; a++){
                    for(int j = 0; j < n.length; j++){
                        if(senha.charAt(a) == n[j]){
                            codigo = 0;
                        }
                    }
                }
                
                if(codigo == 1){
                    JOptionPane.showMessageDialog(null, "Senha necessita de um numero");
                }
            }
            if(codigo == 0){
                codigo = 1;
                for(int a = 0; a < i; a++){
                    for(int j = 0; j < esp.length; j++){
                        if(senha.charAt(a) == esp[j]){
                            codigo = 0;
                        }
                    }
                }
                
                if(codigo == 1){
                    JOptionPane.showMessageDialog(null, "Senha necessita de um caracter especial");
                }
            }
            
            //JOptionPane.showMessageDialog(null, "Chegou aqui");
            
            
        }while(codigo > 0);
        
        if(codigo == 0){
            JOptionPane.showMessageDialog(null, "Senha valida");
        }
        
    }
    
}
