package ru.famally_tree.View.Comand;

import ru.famally_tree.View.Console;

public class AddHuman extends Command{

    public AddHuman(Console console){
        super("Добавит человека в фамильное древо", console);
    }

    @Override
    public void execute() {
        getConsole().addHuman();
    }
}
