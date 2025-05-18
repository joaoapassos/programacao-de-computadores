package exercicio;

import java.util.Date;

public class Log {
    private Date date;
    private double valor;
    private String type;

    Log(String type, double valor){
        this.date = new Date();
        this.valor = valor;
        this.type = type;
    }

    public String toString(){
        return this.date + "\tValor: R$" + this.valor + "\tTipo de Operação: " + this.type;
    }
}
