package gestaoFuncionarios;

public class SalarioInvalidoException extends Exception{
    public SalarioInvalidoException(){
        super("Tentativa de inserir um salario invalido");
    }

    public SalarioInvalidoException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return "Salario deve ser maior que salario minimo (R$ 1.804,00)";
    }
}
