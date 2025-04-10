/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.time.LocalDate;


/**
 *
 * @author joaoapassos
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private boolean invalida = false;
    
    Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
        
        if(a > 0){
            if(m > 0 && m <=12){
                if(d > 0 && d < 28){
                    this.invalida = false;
                }
                else if((d == 29 && m == 2) && a%4 == 0){
                    this.invalida = false;
                }
                
                else if(d == 30 && m != 2){
                    this.invalida = false;
                }
                
                else if((d == 31) && (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)){
                    this.invalida = false;
                }
                else this.invalida = true;
            }
            else this.invalida = true; 
        }
        else this.invalida = true;
    }
    
    Data(){
        LocalDate nowDate = LocalDate.now();
        this.dia = nowDate.getDayOfMonth();
        this.mes = nowDate.getMonthValue();
        this.ano = nowDate.getYear();
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    String dataCompleta(){
        String res;
        if(this.dia < 10 && this.mes > 9){
            res = "0" + this.dia + "/" + this.mes + "/" + this.ano;
        }else if(this.mes < 10 && this.dia > 9){
            res = this.dia + "/" + "0" + this.mes + "/" + this.ano;
        }else if(this.dia < 10 && this.mes < 10){
            res = "0" + this.dia + "/" + "0" + this.mes + "/" + this.ano;
        }else{
            res = this.dia + "/" + this.mes + "/" + this.ano;
        }
        
        return res;
    }
    
    public String getValidData(){
        String res;
        
        if(this.invalida){
            res = "Data invalida";
        }
        else res = "Data valida";
        
        return res;
    }
    
    String avancarData(){
        int d = this.dia;
        int m = this.mes;
        int a = this.ano;
                
        if((d == 28 && m == 2) && (a%4 == 1)){
            m++;
            d = 1;
        }
        else if((d == 29 && m == 2) && (a%4 ==0)){
            m++;
            d = 1;
        }
        else if(d == 30 && (m == 4 || m == 6 || m == 9 || m == 11)){
            m++;
            d = 1;
        }else if(d == 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)){
            if(m==12){
                m = 1;
                d = 1;
                a++;
            }
            else {
                m++;
                d = 1;
            }
        }else d++;
        
        
        this.dia = d;
        this.mes = m;
        this.ano = a;
        return "Data alterada para: " + dataCompleta();
    }

    int verefDatas(String data1, String data2){
        // 00/00/0000
        int res;
        int d1 = Integer.parseInt(data1.charAt(0) + "" + data1.charAt(1));
        int m1 = Integer.parseInt(data1.charAt(3) + "" + data1.charAt(4));
        int a1 = Integer.parseInt(data1.charAt(6) + "" + data1.charAt(7) + data1.charAt(8) + data1.charAt(9));

        int d2 = Integer.parseInt(data2.charAt(0) + "" + data2.charAt(1));
        int m2 = Integer.parseInt(data2.charAt(3) + "" + data2.charAt(4));
        int a2 = Integer.parseInt(data2.charAt(6) + "" + data2.charAt(7) + data2.charAt(8) + data2.charAt(9));

        if(a1 == a2){
            if(m1 == m2){
                if(d1 == d2) res = 0;
                else if(d1 > d2) res = 1;
                else res = -1;
            }
            else if(m1 > m2) res = 1;
            else res = -1;
        }
        else if(a1 > a2) res = 1;
        else res = -1;

        return res;
    }

    String verifAnoBissexto(){
        String res;
        if(this.ano%4 == 0) res = "Ano bissexto";
        else res = "Ano nao bissexto";

        return res;
    }
}