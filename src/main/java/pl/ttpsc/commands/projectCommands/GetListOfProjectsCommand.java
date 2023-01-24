package pl.ttpsc.commands.projectCommands;

import pl.ttpsc.app.MenuComponent;

public class GetListOfProjectsCommand implements MenuComponent {
    String name;

    public GetListOfProjectsCommand(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void execute() {
        System.out.println("List all projects");
    }

    public void getNameWithSeparator() {
        System.out.print("  " + getName());
        System.out.println("");
    }

}
