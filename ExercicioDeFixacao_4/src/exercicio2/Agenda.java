package exercicio2;

public class Agenda {
    private Contato[] contatos;
    private int qtdContatos;

    Agenda(int tamanho){
        this.contatos = new Contato[tamanho];
        this.qtdContatos = 0;
    }

    void adicionarContato(Contato contato){
        if(qtdContatos < this.contatos.length){
            this.contatos[qtdContatos] = contato;
            qtdContatos++;
        }
        else{
            System.out.println("Agenda cheia");
        }
    }

    void removeContato(String nome){
        for(int i = 0; i<qtdContatos; i++){
            if(nome.equals(contatos[i].getName())){
                for(int j = i; j < qtdContatos - 1; j++){
                    contatos[j] = contatos[j+1];
                }
                contatos[qtdContatos - 1] = null;
                qtdContatos--;
                break;
            }
        }
    }

    Contato pesquisarPorNome(String nome) {
        for (int i = 0; i < qtdContatos; i++) {
            if (contatos[i].getName().equals(nome)) {
                return contatos[i];
            }
        }
        return null;
    }

    Contato pesquisarPorCpfCnpj(String cpfCnpj) {
        for (int i = 0; i < qtdContatos; i++) {
            if (contatos[i] instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) contatos[i];
                if (pf.getCpf().equals(cpfCnpj)) {
                    return pf;
                }
            } else if (contatos[i] instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) contatos[i];
                if (pj.getCnpj().equals(cpfCnpj)) {
                    return pj;
                }
            }
        }
        
        return null;
    }

    void imprimirContatos() {
        for (int i = 0; i < qtdContatos; i++) {
            if (contatos[i] instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) contatos[i];
                
                System.out.println(pf.imprimir());

            } else if (contatos[i] instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) contatos[i];
                
                System.out.println(pj.imprimir());
            }
        }
    }

    

    // void ordenarLista(){
        
    // }
    
}
