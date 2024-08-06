package ru.famally_tree.View.Comand;

import ru.famally_tree.View.Console;

public abstract class Command {

    private String descriptoin;
    private Console console;

    public Command(String descriptoin, Console console) {
        this.descriptoin = descriptoin;
        this.console = console;
    }

    Console getConsole(){
        return console;
    }

    public String getDescriptoin(){
        return descriptoin;
    }

    public abstract void execute();
}
