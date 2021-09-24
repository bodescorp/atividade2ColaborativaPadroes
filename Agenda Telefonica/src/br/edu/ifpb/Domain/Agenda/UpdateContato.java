package br.edu.ifpb.Domain.Agenda;
import br.edu.ifpb.Domain.Agenda_;
import br.edu.ifpb.Domain.Command;
import br.edu.ifpb.Domain.Contato_;

public class UpdateContato implements Command{
    private String nome;
    private int telefone;
    private Agenda_ agenda_;
    private Contato_ contato;

    public UpdateContato(Agenda_ agenda_, Contato_ contato ) {
        this.contato = contato;
        this.agenda_ = agenda_;
    }

    public void execute() {
        try{
            for(int i = 0; i < agenda_.getcontatosSalvos().size(); i++){
                if(agenda_.getcontatosSalvos().get(i).getNomeContato().equals(nome) && agenda_.getcontatosSalvos().get(i).getNumeroTelefone() == telefone){
                    agenda_.getcontatosSalvos().get(i).setNomeContato(contato.getNomeContato());
                    agenda_.getcontatosSalvos().get(i).setApelido(contato.getApelido());
                    agenda_.getcontatosSalvos().get(i).setDDD(contato.getDDD());
                    agenda_.getcontatosSalvos().get(i).setNumeroTelefone(contato.getNumeroTelefone());
                    agenda_.getcontatosSalvos().get(i).setEmail(contato.getEmail());
                    agenda_.getcontatosSalvos().get(i).setAnotacao(contato.getAnotacao());
                }
            }
            System.out.println("\nContato atualizado!");
//            return true;
        } catch (Exception e){
            System.out.println("\nOcorreu um erro ao tentar atualizado o contato de " + contato.getNomeContato());
//            return false;
        }

}}
