package pl.ttpsc.commands.documentCommands;

import pl.ttpsc.app.MenuComponent;

public class CreateDocumentCommand implements MenuComponent {
    String name;

    public CreateDocumentCommand(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void execute() {
        System.out.println("Document added");
    }

    public void getNameWithSeparator() {
        System.out.print("  " + getName());
        System.out.println("");
    }

}



