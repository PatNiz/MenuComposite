package pl.ttpsc.app;

public class MenuItem implements MenuComponent {
    String name;

    public MenuItem(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void execute() {
        System.out.println("execute");
    }

    public void getNameWithSeparator() {
        System.out.print("  " + getName());
        System.out.println("");
    }

}




