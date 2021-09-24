package br.edu.ifpb.Domain.Agenda;

import br.edu.ifpb.Domain.Agenda_;
import br.edu.ifpb.Domain.Command;

public class ListContato implements Command {
    private Agenda_ agenda_;

    public ListContato(Agenda_ agenda_) {
        this.agenda_ = agenda_;
    }

    public void execute() {
        try {
            for (int i = 0; i < agenda_.getcontatosSalvos().size(); i++) {
                System.out.println("Nome: " + agenda_.getcontatosSalvos().get(i).getNomeContato());
                System.out.println("Apelido: " + agenda_.getcontatosSalvos().get(i).getApelido());
                System.out.println("DDD: " + agenda_.getcontatosSalvos().get(i).getDDD());
                System.out.println("Telefone: " + agenda_.getcontatosSalvos().get(i).getNumeroTelefone());
                System.out.println("E-mail: " + agenda_.getcontatosSalvos().get(i).getEmail());
                System.out.println("Anotação: " + agenda_.getcontatosSalvos().get(i).getAnotacao());
                System.out.println("\n");
            }
            // return true;
        } catch (Exception e) {
            System.out.println("\nOcorreu um erro ao tentar listar seus contatos, tente novamente!");
            // return false;
        }

    }
}