package supermercado;

public class Supermercado {
    public static void main(String[] args){
        Shampoo[] shampoos = new Shampoo[3];
        Biscoito[] biscoitos = new Biscoito[3];
        Leite[] leites = new Leite[3];

        Shampoo s1 = new Shampoo("Shampoo", 10, 2);
        Shampoo s2 = new Shampoo("Shampoo", 10, 5);
        Shampoo s3 = new Shampoo("Shampoo", 10, 3);

        shampoos[0] = s1;
        shampoos[1] = s2;
        shampoos[2] = s3;

        Biscoito b1 = new Biscoito("Biscoito", 5, 3);
        Biscoito b2 = new Biscoito("Biscoito", 5, 0);
        Biscoito b3 = new Biscoito("Biscoito", 5, 7);

        biscoitos[0] = b1;
        biscoitos[1] = b2;
        biscoitos[2] = b3;

        Leite l1 = new Leite("Leite", 8, 5);
        Leite l2 = new Leite("Leite", 8, 2);
        Leite l3 = new Leite("Leite", 8, 10);

        leites[0] = l1;
        leites[1] = l2;
        leites[2] = l3;

        System.out.println("Comparação com Shampoo");

        int index = 0;
        for(int i = 0; i<shampoos.length; i++){
            int  res = shampoos[i].compareTo(shampoos[index]);

            if(res<1){
                index = i;
            }
        }

        System.out.println("O melhor shampoo custo 'e: " + shampoos[index].toString());

        System.out.println("Comparação com Biscoitos");

        index = 0;
        
        for(int i = 0; i<biscoitos.length; i++){
            int res = biscoitos[i].compareTo(biscoitos[index]);

            if(res<0){
                index = i;
            }
        }

        System.out.println("O melhor biscoito custo 'e: " + biscoitos[index].toString());

        System.out.println("Comparação com Leite");

        index = 0;
        
        for(int i = 0; i<leites.length; i++){
            int res = leites[i].compareTo(leites[index]);
            if(res==-1){
                index = i;
            }
        }

        System.out.println("O melhor leite custo 'e: " + leites[index].toString());

    }
}
