package FamilyTree.Fam.Tree.view.commands;

import FamilyTree.Fam.Tree.view.ConsoleUI;

public class readFam extends Command {
    public readFam(ConsoleUI ConsoleUI) {
        super("Загружаем Семейное древо ", ConsoleUI);
    }

    @Override
    public void execute(String path) {
        super.getConsoleUI().readFam(path);
    }

    @Override
    public void execute() {

    }
}
