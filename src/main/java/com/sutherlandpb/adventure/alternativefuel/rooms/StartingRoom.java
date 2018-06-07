package com.sutherlandpb.adventure.alternativefuel.rooms;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartingRoom implements RoomInterface {

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @Override
    public String getName() {
        return "Office";
    }

    @Override
    public String start(String enteringMessage) {
        return enteringMessage + "You are in the office of a mechanic shop.";
    }

    @Override
    public String look() {
        return "It's the same old office where you clock in and out.  There is an out of date calendar on the wall with a picture of a bright red PX450, the car looks fast.  There is a door to the North.";
    }

    @Override
    public String goNorth() {
        return playerDataContainer.setNextRoom("You go North... ", new AutoShopRoom());
    }

    @Override
    public String goSouth() {
        return "You can't go South!";
    }

    @Override
    public String goWest() {
        return "You can't go West!";
    }

    @Override
    public String goEast() {
        return "You can't go East!";
    }
}
