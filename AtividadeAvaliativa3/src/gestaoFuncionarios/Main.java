package gestaoFuncionarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Gerenciamento de Funcionarios\n\n");

        int qtdProgramadores = 0;
        int qtdDesigners = 0;
        boolean inputsPreenchidos = false;
        
        do{
            System.out.print("Quantos designers voce deseja cadastrar: ");
            String input = sc.next();

            try{
                qtdDesigners = Integer.parseInt(input);
                inputsPreenchidos = true;
            }
            catch(NumberFormatException e){
                System.out.println("O input espera por um numero\n\nMais detalhes do erro: " + e.getMessage());
            }
        }
        while(!inputsPreenchidos);

        inputsPreenchidos = false;


        do{
            System.out.print("Quantos programadores voce deseja cadastrar: ");
            String input = sc.next();

            try{
                qtdProgramadores = Integer.parseInt(input);
                inputsPreenchidos = true;
            }
            catch(NumberFormatException e){
                System.out.println("O input espera por um numero\n\nMais detalhes do erro: " + e.getMessage());
            }
        }
        while(!inputsPreenchidos);

        Designer[] d = null;
        Programador[] p = null;

        if(inputsPreenchidos == true && qtdDesigners > 0){
            d = new Designer[qtdDesigners];
        }
        if(inputsPreenchidos == true && qtdProgramadores > 0){
            p = new Programador[qtdProgramadores];
        }

        String content = "";

        if(d != null){
            System.out.println("\nCadastrando Designers:");

            for(int i = 0; i < d.length; i++){
                inputsPreenchidos = false;
                do{
                    System.out.println("Cadastro do " + (i + 1) + "° Designer");
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.print("Salario Base: ");
                    String input = sc.next();
                    double salario = 0;
                    try{
                        salario = Double.parseDouble(input);
                        validarSalario(salario);               
                        d[i] = new Designer(nome, salario);
                        inputsPreenchidos = true;
                        content += d[i].toString() + "\n";
                    }
                    catch(NumberFormatException e){
                        System.out.println("\nO input [Salario] espera um numero do tipo double\nMais detalhes do erro: " + e.getMessage() + "\n\n");
                    }
                    catch(SalarioInvalidoException e){
                        System.out.println("\n" + e.getMessage() + "\n\nMais detalhes do erro:" + e.toString() + "\n\n");
                    }

                }
                while(!inputsPreenchidos);             
            }
        }

        if(p != null){
            
            System.out.println("\nCadastrando Programadores:");

            for(int i = 0; i < p.length; i++){
                inputsPreenchidos = false;
                do{
                    System.out.println("Cadastro do " + (i + 1) + "° Programador");
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.print("Salario Base: ");
                    String input = sc.next();
                    double salario = 0;
                    try{
                        salario = Double.parseDouble(input);
                        validarSalario(salario);               
                        p[i] = new Programador(nome, salario);
                        inputsPreenchidos = true; 
                        content += p[i].toString() + "\n";   
                    }
                    catch(NumberFormatException e){
                        System.out.println("\nO input [Salario] espera um numero do tipo double\nMais detalhes do erro: " + e.getMessage() + "\n\n");
                    }
                    catch(SalarioInvalidoException e){
                        System.out.println("\n" + e.getMessage() + "\n\nMais detalhes do erro:" + e.toString() + "\n\n");
                    }

                }
                while(!inputsPreenchidos);             
            }
        }

        if(content != ""){
            writeFile(content, "funcionarios");
            String res = readFile("funcionarios");
    
            System.out.println("\n\nArquivo lido:\n\n" + res);
        }


    }

    //Valida salario verificando se salario é maior que um salario mínimo caso não seja lança SalarioInvalidoException
    public static double validarSalario(double salario) throws SalarioInvalidoException{
        if(salario < 1804.0f) throw new SalarioInvalidoException();
        return salario;
    }

    //Aqui esta escrevendo o arquivo
    public static void writeFile(String content, String nameFile){
        FileWriter fw = null;

        boolean nextCreateFile = false;

        do{
            File f = new File(nameFile + ".txt");
            nextCreateFile = true;
            if(f.exists()){
                Scanner sc = new Scanner(System.in);
                nextCreateFile = false;
                System.out.print("Arquivo ja existe deseja sobrepor esse arquivo [sim ou nao]: ");
                String res = sc.next();
                if(res.contains("sim")) nextCreateFile = true;
                else{
                    System.out.print("Ok, Informe um novo nome para seu arquivo: ");
                    nameFile = sc.next();
                }
            }
        }
        while(nextCreateFile != true);

        try{
            fw = new FileWriter(nameFile + ".txt");
        }
        catch(IOException e){
            System.out.println("\nErro na abertura do arquivo!\n\nDetalhes do erro: " + e.getMessage());
        }

        if(fw != null){
            try{
                fw.write(content);
            }
            catch(IOException e){
                System.out.println("\nErro na escrita do arquivo!\n\nDetalhes do erro: " + e.getMessage());
            }

            try{
                fw.close();
            }
            catch(IOException e){
                System.out.println("\nErro durante o fechamento do arquivo!\n\nDetalhes do erro: " + e.getMessage());
            }
        }

        System.out.println("Sucesso ao criar o arquivo!");
    }
    
    //Aqui esta escrevendo o arquivo
    public static String readFile(String nameFile){
        String r = "";
        int c = 0;
        FileReader fr = null;

        try{
            fr = new FileReader(nameFile + ".txt");
        }
        catch(FileNotFoundException e){
            System.out.println("\nArquivo nao encontrado!\n\nDetalhes do erro: " + e.getMessage());
        }

        if(fr != null){
            do{
                r += (char) c;

                try{
                    c = fr.read();
                }
                catch(IOException e){
                    System.out.println("\nErro ao ler o arquivo\n\nDetalhes do erro: " + e.getMessage());
                }
            } 
            while(c != -1);

            try{
                fr.close();
            }
            catch(IOException e){
                System.out.println("\nErro ao fechar o arquivo\n\nDetalhes do erro: " + e.getMessage());
            }
        }

        System.out.println("Sucesso ao ler o arquivo");

        return r;
    }
}
