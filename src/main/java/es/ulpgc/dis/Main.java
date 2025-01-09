package es.ulpgc.dis;

import es.ulpgc.dis.commands.ImportCommand;

public class Main {
    public static void main(String[] args) throws Exception {
        ImportCommand command = new ImportCommand();
        command.execute();
    }

}
