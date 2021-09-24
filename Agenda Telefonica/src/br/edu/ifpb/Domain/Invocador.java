package br.edu.ifpb.Domain;

public class Invocador {
    private Command command;

    public Invocador() {
       
    }
    public void ativar(){
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
