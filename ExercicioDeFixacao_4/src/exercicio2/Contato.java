package exercicio2;

public class Contato {
    private String name;
    private String adress;
    private String email;
    Contato(String n, String a, String e){
        this.name = n;
        this.adress = a;
        this.email = e;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getAdress() {
        return this.adress;
    }
}
