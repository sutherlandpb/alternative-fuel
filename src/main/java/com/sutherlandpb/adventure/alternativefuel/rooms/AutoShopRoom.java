package com.sutherlandpb.adventure.alternativefuel.rooms;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoShopRoom implements RoomInterface{

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @Autowired
    private StartingRoom startingRoom;

    @Override
    public String getName() {
        return "Auto Shop";
    }

    @Override
    public String start( String enteringMessage) {
        return enteringMessage + "You are in the mechanic shop.";
    }

    @Override
    public String look() {
        return "What do you expect, it's the garage.  All of the customer cars are done for the day, the only thing left is your car.  The thunderhead racer.";
    }

    @Override
    public String goNorth() {
        return "You can't go North!";
    }

    @Override
    public String goSouth() {
        return playerDataContainer.setNextRoom("You go South... ", startingRoom);
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
