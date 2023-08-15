package FamilyTree.Fam.Tree.view.commands;

import FamilyTree.Fam.Tree.view.ConsoleUI;

public class GetHumansInfo extends Command {

    public GetHumansInfo(ConsoleUI consoleUI) {
        super("Получить список людей древа", consoleUI);
    }

    @Override
    public  void execute(String path) {

        super.getConsoleUI().getHumansInfo();
    }

    @Override
    public void execute() {

    }
}
