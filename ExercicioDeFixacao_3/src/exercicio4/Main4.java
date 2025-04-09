/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author emef-jbmarcondes
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d = new Data();
        
        String data = d.dataCompleta();
        
        System.out.println(data);
        System.out.println(d.getValidData());
    }
    
}
