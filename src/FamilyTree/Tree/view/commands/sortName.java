package FamilyTree.Tree.view.commands;

import FamilyTree.Tree.view.ConsoleUI;

public class sortName extends Command {

    public sortName(ConsoleUI consoleUI) {
        super("Отсортировать людей по имени", consoleUI);
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public void execute() {
        super.getConsoleUI().sortName();
    }
}