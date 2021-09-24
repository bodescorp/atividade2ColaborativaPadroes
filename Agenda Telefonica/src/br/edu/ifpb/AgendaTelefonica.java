/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb;

import br.edu.ifpb.Domain.Agenda_;
import br.edu.ifpb.Domain.Contato_;
import br.edu.ifpb.Domain.Invocador;
import br.edu.ifpb.Domain.Agenda.AddContato;
import br.edu.ifpb.Domain.Agenda.ListContato;


public class AgendaTelefonica {

   
    public static void main(String[] args) {
        Agenda_ agenda = new Agenda_();
        Invocador invocador = new Invocador();
        
        invocador.setCommand(new AddContato(new Contato_("Amanda","Mandy",83,999792415,"amanda@gmail.com","Contato pessoal"), agenda));
        invocador.ativar();

        invocador.setCommand(new ListContato(agenda));
        invocador.ativar();

        
    }

}
