package pl.ttpsc.commands.userCommands;

import pl.ttpsc.app.MenuComponent;

public class DeleteUserCommand implements MenuComponent {
    String name;


    public DeleteUserCommand(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void execute() {
        System.out.println("User deleted");
    }

    public void getNameWithSeparator() {
        System.out.print("  " + getName());
        System.out.println("");
    }

}



