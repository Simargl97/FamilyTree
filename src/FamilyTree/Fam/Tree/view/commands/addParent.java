package FamilyTree.Fam.Tree.view.commands;

import FamilyTree.Fam.Tree.view.ConsoleUI;

public class addParent extends Command{
    public addParent(ConsoleUI consoleUI) {
        super("Добавить родителя" ,consoleUI);
    }

    @Override
    public void execute(String path) {
        getConsoleUI().addParent();

    }
    @Override
    public void execute() {

    }
}
