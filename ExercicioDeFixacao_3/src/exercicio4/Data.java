/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.time.LocalDate;


/**
 *
 * @author emef-jbmarcondes
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
    
    
}
