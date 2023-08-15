package FamilyTree.Fam.Tree.view.commands;

import FamilyTree.Fam.Tree.view.ConsoleUI;

public class addChildren extends Command{

    public addChildren(ConsoleUI consoleUI) {
        super("Добавить ребенка", consoleUI);
    }


    @Override
    public void execute(String path) {
        getConsoleUI().addChildren();

    }

    @Override
    public void execute() {
        getConsoleUI().addChildren();
    }
}
