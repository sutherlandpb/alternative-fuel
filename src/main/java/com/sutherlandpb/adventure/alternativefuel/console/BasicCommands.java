package com.sutherlandpb.adventure.alternativefuel.console;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class BasicCommands {

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @ShellMethod("start a game")
    public String start() {
        return playerDataContainer.startFirstTime();
    }

    @ShellMethod("save [name]   Save your game.")
    public String save(@ShellOption(defaultValue = "default") String name ) {
        return String.format("Saving (%s)", name);
    }

    @ShellMethod("load [game]   Load your game")
    public String load(@ShellOption(defaultValue = "default") String name ) {
        return String.format("Loading (%s)", name);
    }

}
