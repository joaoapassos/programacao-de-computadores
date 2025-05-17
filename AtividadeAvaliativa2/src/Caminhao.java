public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String placa, String modelo, String tipo, int horaEntrada, double capacidadeCarga){
        super(placa, modelo, tipo, horaEntrada);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
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
        return 15;
    }

    public String toString(){
        return "Placa: " + this.getPlaca() + ", Modelo: " + this.getModelo() + ", Tipo: " + this.getTipo() + ", Hora de Entrada: " + this.getHoraEntrada() + "h, Capaciadade de Carga: " + this.capacidadeCarga + " kg";
    }
}
