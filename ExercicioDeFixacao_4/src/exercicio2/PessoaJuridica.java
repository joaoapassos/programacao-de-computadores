package exercicio2;

public class PessoaJuridica extends Contato {
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;
    
    PessoaJuridica(String n, String a, String e, String cnpj, String inscricao, String razao){
        super(n, a, e);

        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricao;
        this.razaoSocial = razao;
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
    public String getCnpj() {
        return cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }

    String imprimir(){
        return "Pessoa Física - Nome: " + getName() + ", CPF: " + this.cnpj + ", Endereço: " + getAdress() + ", Email: " + getEmail() + ", Inscrição Estadual: " + this.inscricaoEstadual + "Razao Social: " + this.razaoSocial;
    }
}
