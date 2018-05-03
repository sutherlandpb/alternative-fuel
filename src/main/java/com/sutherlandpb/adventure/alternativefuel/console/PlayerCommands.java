package com.sutherlandpb.adventure.alternativefuel.console;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import com.sutherlandpb.adventure.alternativefuel.service.RoomNavigationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class PlayerCommands {

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @ShellMethod("Go North")
    public String north() {
        return playerDataContainer.getCurrentRoom().goNorth();
    }
    @ShellMethod("Go South")
    public String south() {
        return playerDataContainer.getCurrentRoom().goSouth();
    }
    @ShellMethod("Go West")
    public String west() {
        return playerDataContainer.getCurrentRoom().goWest();
    }
    @ShellMethod("Go East")
    public String east() {
        return playerDataContainer.getCurrentRoom().goEast();
    }
    @ShellMethod("Look around")
    public String look() {
        return playerDataContainer.getCurrentRoom().look();
    }
    @ShellMethod("Say \"something\" (you have to use quotes for now)")
    public String say(@ShellOption String something) {
        return "You say " + something.trim();
    }
    @ShellMethod("Say \"something\" (you have to use quotes for now)")
    public String say(@ShellOption String something) {
        return "You say " + something.trim();
    }
}
