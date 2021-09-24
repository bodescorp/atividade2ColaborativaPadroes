package br.edu.ifpb.Domain.Agenda;

import br.edu.ifpb.Domain.Agenda_;
import br.edu.ifpb.Domain.Command;
import br.edu.ifpb.Domain.Contato_;

public class DeleteContato implements Command {

    private int ddd;
    private int telefone;
    private Agenda_ agenda_;

    public DeleteContato(Contato_ contato,Agenda_ agenda_ ) {
        this.agenda_ = agenda_;
    }

    public void execute() {

        try {
            for (int i = 0; i < agenda_.getcontatosSalvos().size(); i++) {
                if (agenda_.getcontatosSalvos().get(i).getDDD() == ddd && agenda_.getcontatosSalvos().get(i).getNumeroTelefone() == telefone) {
                    agenda_.getcontatosSalvos().remove(i);
                    System.out.println("\nContato removido com Sucesso!");
                }
            }
            // return true;
        } catch (Exception e) {
            System.out.println("\nOcorreu um erro durante a remocão de um contato, tente novamente");
            // return false;
        }
    }
}
