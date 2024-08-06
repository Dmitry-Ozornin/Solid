package ru.famally_tree.View;

import ru.famally_tree.View.Comand.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commands;

    public Menu(Console console){
        commands = new ArrayList<>();
        commands.add(new AddHuman(console));
        commands.add(new Findname(console));
        commands.add(new SortByBirth(console));
        commands.add(new SortByName(console));
        commands.add(new RemoveHuman(console));
        commands.add(new GetHumanList(console));
        commands.add(new Finish(console));
    }

    public String getMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescriptoin());
            stringBuilder.append("\n");


        }
        return stringBuilder.toString();
    }

    public int size(){
        return commands.size();
    }

    public void execute(int coise){
        Command command = commands.get(coise - 1);
        command.execute();
    }

}
