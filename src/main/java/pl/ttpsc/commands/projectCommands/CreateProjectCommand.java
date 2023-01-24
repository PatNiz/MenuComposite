package pl.ttpsc.commands.projectCommands;

import pl.ttpsc.app.MenuComponent;

public class CreateProjectCommand implements MenuComponent {
    String name;

    public CreateProjectCommand(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void execute() {
        System.out.println("Project added");
    }

    public void getNameWithSeparator() {
        System.out.print("  " + getName());
        System.out.println("");
    }

}



