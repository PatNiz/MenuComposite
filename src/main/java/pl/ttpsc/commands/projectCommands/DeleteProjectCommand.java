package pl.ttpsc.commands.projectCommands;

import pl.ttpsc.app.MenuComponent;

public class DeleteProjectCommand implements MenuComponent {
    String name;

    public DeleteProjectCommand(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void execute() {
        System.out.println("Project deleted");
    }

    public void getNameWithSeparator() {
        System.out.print("  " + getName());
        System.out.println("");
    }

}
