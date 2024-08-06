package ru.famally_tree.View.Comand;

import ru.famally_tree.View.Console;

public class Finish extends Command {

    public Finish(Console console){
        super("Завершить программу", console);
    }

    @Override
    public void execute() {
        getConsole().finishWork();
    }
}
