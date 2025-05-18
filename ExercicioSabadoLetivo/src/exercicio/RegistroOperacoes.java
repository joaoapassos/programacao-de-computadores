package exercicio;

import java.util.ArrayList;

public class RegistroOperacoes {
    private ArrayList<String> logs;

    public RegistroOperacoes(){
        logs = new ArrayList<>();
    }

    public void AddRegistro(Log log){
        logs.add(log.toString());
    }

    public void RemoveRegistro(Log log){
        logs.remove(log.toString());
    }
    public String GetAllRegistros(){
        String registros = "";

        for(String log : logs){
            registros += "\n" + log;
        }

        return registros;
    }
}
