package br.edu.ifpb.Domain.Agenda;


import br.edu.ifpb.Domain.Agenda_;
import br.edu.ifpb.Domain.Command;
import br.edu.ifpb.Domain.Contato_;

public class AddContato implements Command {
    private Contato_ contato;

    private Agenda_ agenda;



    public AddContato(Contato_ contato, Agenda_ agenda) {
        this.contato = contato;
        this.agenda = agenda;
    }

    public void execute() {

        try {
            agenda.getcontatosSalvos().add(contato);
            System.out.println("\nContato salvo com sucesso!");
            // return true;
        } catch (Exception e) {
            System.out.println("\nOcorreu um erro ao tentar inserir contato, tente novamente!");
            // return false;
        }

    }
}
