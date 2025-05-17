package exercicio2;

import java.time.LocalDate;

public class PessoaFisica extends Contato{
    private String cpf;
    private String dataNasc;
    private int dia;
    private int mes;
    private int ano;
    private String estadoCivil;

    PessoaFisica(String n, String a, String e, String cpf, String data, String estado){
        super(n, a, e);
        this.cpf = cpf;
        this.dataNasc = data;
        this.estadoCivil = estado;

        armazenarData();
    }

    void armazenarData(){
        this.dia = Integer.parseInt(this.dataNasc.charAt(0) + "" + this.dataNasc.charAt(1));
        this.mes = Integer.parseInt(this.dataNasc.charAt(3) + "" + this.dataNasc.charAt(4));
        this.ano = Integer.parseInt(this.dataNasc.charAt(6) + "" + this.dataNasc.charAt(7) + this.dataNasc.charAt(8) + this.dataNasc.charAt(9));
    }

    @Override public String getName() {
        return super.getName();
    }
    @Override public String getEmail() {
        return super.getEmail();
    }
    @Override public String getAdress() {
        return super.getAdress();
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getDataNasc() {
        return this.dataNasc;
    }
    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    String imprimir(){
        return "Pessoa Física - Nome: " + getName() + ", CPF: " + this.cpf + ", Endereço: " + getAdress() + ", Email: " + getEmail() + ", Nascimento: " + this.dataNasc + ", Estado Civil: " + this.estadoCivil;
    }

}
