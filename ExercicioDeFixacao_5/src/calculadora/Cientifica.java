package calculadora;

public class Cientifica extends Calculadora{

    public void raizQuadrada(double num){
        System.out.printf("%.1f", Math.sqrt(num));
    }
    public void potencia(double base, double expoente){
        System.out.printf("%.1f", Math.	pow(base, expoente));
    }
}
