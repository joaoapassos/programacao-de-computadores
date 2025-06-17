package calculadora;

public abstract class Calculadora {
    public void soma(float num, float num2){
        System.out.printf("%.1f", num + num2);
    }
    public void subtracao(float num, float num2){
        System.out.printf("%.1f", num - num2);
    }
    public void divisao(float num, float num2){
        System.out.printf("%.1f", num / num2);
    }
    public void multiplicacao(float num, float num2){
        System.out.printf("%.1f", num * num2);
    }
}