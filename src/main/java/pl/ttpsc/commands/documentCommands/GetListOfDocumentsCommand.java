package pl.ttpsc.commands.documentCommands;

import pl.ttpsc.app.MenuComponent;

public class GetListOfDocumentsCommand implements MenuComponent {
    String name;

    public GetListOfDocumentsCommand(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void execute() {
        System.out.println("List of documents");
    }

    public void getNameWithSeparator() {
        System.out.print("  " + getName());
        System.out.println("");
    }

}



