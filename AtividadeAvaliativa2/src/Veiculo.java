public class Veiculo {
    private String placa;
    private String modelo;
    private String tipo;
    private int horaEntrada;

    public Veiculo(String placa, String modelo, String tipo, int horaEntrada){
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int calcularTaxa(){
        return 0;
    }
}
