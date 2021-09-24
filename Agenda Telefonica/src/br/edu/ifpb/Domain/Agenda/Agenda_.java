package br.edu.ifpb.Domain.Agenda;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.Domain.Contato_;


public class Agenda_ {
    
    private List<Contato_> contatosSalvos = new ArrayList<>();

    public Agenda_() {
    }

    public List<Contato_> getcontatosSalvos(){
        return contatosSalvos;
    }
   
}

//         public void updateContato(String nome, int telefone, Contato contato){
        
//         try{
//             for(int i = 0; i < contatosSalvos.size(); i++){
//                 if(contatosSalvos.get(i).getNomeContato().equals(nome) && contatosSalvos.get(i).getNumeroTelefone() == telefone){
//                     contatosSalvos.get(i).setNomeContato(contato.getNomeContato());
//                     contatosSalvos.get(i).setApelido(contato.getApelido());
//                     contatosSalvos.get(i).setDDD(contato.getDDD());
//                     contatosSalvos.get(i).setNumeroTelefone(contato.getNumeroTelefone());
//                     contatosSalvos.get(i).setEmail(contato.getEmail());
//                     contatosSalvos.get(i).setAnotacao(contato.getAnotacao());
//                 }
//             }
//             System.out.println("\nContato atualizado!");
// //            return true;
//         } catch (Exception e){
//             System.out.println("\nOcorreu um erro ao tentar atualizado o contato de " + contato.getNomeContato());
// //            return false;
//         }
        
//     }

//     public void searchNome(String nome) {
        
//         int aux = 0;
        
//         try{
//             for(int i = 0; i < contatosSalvos.size(); i++){
//                 if(contatosSalvos.get(i).getNomeContato().equals(nome)){
//                     System.out.println("Nome: " + contatosSalvos.get(i).getNomeContato());
//                     System.out.println("Apelido: " + contatosSalvos.get(i).getApelido());
//                     System.out.println("DDD: " + contatosSalvos.get(i).getDDD());
//                     System.out.println("Telefone: " + contatosSalvos.get(i).getNumeroTelefone());
//                     System.out.println("E-mail: " + contatosSalvos.get(i).getEmail());
//                     System.out.println("Anotação: " + contatosSalvos.get(i).getAnotacao());
//                     System.out.println("\n");
//                     aux = aux + 1;
//                 }
//             }
//             if(aux == 0){
//                 System.out.println("\nContato não cadastrado!");
//             }
//         } catch (Exception e){
//             System.out.println("\nOcorreu um erro durante sua busca, tente novamente");
//         }
        
//     }

//     public void searchTelefone(int ddd, int telefone) {
//         int aux = 0;
        
//         try{
//             for(int i = 0; i < contatosSalvos.size(); i++){
//                 if(contatosSalvos.get(i).getDDD() == ddd && contatosSalvos.get(i).getNumeroTelefone() == telefone){
//                     System.out.println("Nome: " + contatosSalvos.get(i).getNomeContato());
//                     System.out.println("Apelido: " + contatosSalvos.get(i).getApelido());
//                     System.out.println("DDD: " + contatosSalvos.get(i).getDDD());
//                     System.out.println("Telefone: " + contatosSalvos.get(i).getNumeroTelefone());
//                     System.out.println("E-mail: " + contatosSalvos.get(i).getEmail());
//                     System.out.println("Anotação: " + contatosSalvos.get(i).getAnotacao());
//                     System.out.println("\n");
//                     aux = aux + 1;
//                 }
//             }
//             if(aux == 0){
//                 System.out.println("\nContato não cadastrado!");
//             }
//         } catch (Exception e){
//             System.out.println("\nOcorreu um erro durante sua busca, tente novamente");
//         }
//    }
    
//}
