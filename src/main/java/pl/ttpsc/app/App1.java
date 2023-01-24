package pl.ttpsc.app;
import pl.ttpsc.app.utility.TTPSCMenu;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu mainMenu = TTPSCMenu.getMainMenu();
        mainMenu.chooseOption(scanner);
    }
}
