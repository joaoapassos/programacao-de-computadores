package exercicio2;

import java.util.Scanner;

public class exceptionOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean ok = true;
        do{
            ok = true;
            System.out.print("Entre com um numero: ");
            String input = sc.next();
            try{
                num = Integer.parseInt(input);
            }
            catch(NumberFormatException e){
                System.out.println("Opa… Acho que você se enganou! Digite novamente…");
                ok = false;
            }
        }while(!ok);

        System.out.println("Quadrado do numero: " + num + ", 'e: " + num*num);
    }
}
