public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String placa, String modelo, String tipo, int horaEntrada, int cilindrada){
        super(placa, modelo, tipo, horaEntrada);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    @Override
    public String getPlaca() {
        return super.getPlaca();
    }
    @Override
    public String getModelo() {
        return super.getModelo();
    }
    @Override
    public String getTipo() {
        return super.getTipo();
    }
    @Override
    public int getHoraEntrada() {
        return super.getHoraEntrada();
    }

    @Override
    public int calcularTaxa(){
        return 5;
    }

    public String toString(){
        return "Placa: " + this.getPlaca() + ", Modelo: " + this.getModelo() + ", Tipo: " + this.getTipo() + ", Hora de Entrada: " + this.getHoraEntrada() + "h, Cilindrada: " + this.cilindrada;
    }
}
