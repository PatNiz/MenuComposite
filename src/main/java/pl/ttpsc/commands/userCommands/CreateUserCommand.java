package pl.ttpsc.commands.userCommands;

import pl.ttpsc.app.MenuComponent;

public class CreateUserCommand implements MenuComponent {
    String name;

    public CreateUserCommand(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void execute() {
        System.out.println("User added");
    }

    public void getNameWithSeparator() {
        System.out.print("  " + getName());
        System.out.println("");
    }

}



