/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author joaoapassos
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        Data newData = new Data();
        
        Data d1 = new Data(24, 10, 2025);
        
        String data1 = d1.dataCompleta();
        
        System.out.println(data1);
        System.out.println(d1.getValidData());
        //System.out.println(d1.avancarData());


        Data d2 = new Data(31, 10, 2020);
        
        String data2 = d2.dataCompleta();
        
        System.out.println(data2);
        System.out.println(d2.getValidData());
        //System.out.println(d2.avancarData());


        System.out.println(newData.verefDatas(data1, data2));

        System.out.println(d2.verifAnoBissexto());

    }
    
}
