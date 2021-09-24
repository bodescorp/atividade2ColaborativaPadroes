package br.edu.ifpb.Domain;

import java.util.ArrayList;
import java.util.List;


public class Agenda_ {
    
    private List<Contato_> contatosSalvos = new ArrayList<>();

    public Agenda_() {
    }

    public List<Contato_> getcontatosSalvos(){
        return contatosSalvos;
    }
   
}
