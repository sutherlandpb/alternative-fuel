package com.sutherlandpb.adventure.alternativefuel.console;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class BasicCommands {

    @ShellMethod("save [name]   Save your game.")
    public String save(@ShellOption(defaultValue = "default") String name ) {
        return String.format("Saving (%s)", name);
    }

    @ShellMethod("load [game]   Load your game")
    public String load(@ShellOption(defaultValue = "default") String name ) {
        return String.format("Loading (%s)", name);
    }

}
