package com.sutherlandpb.adventure.alternativefuel.rooms;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AutoShopRoom extends BaseRoom{

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @Autowired
    private StartingRoom startingRoom;

    @PostConstruct
    public void setRooms() {
        this.setNorthRoom(null);
        this.setSouthRoom(startingRoom);
        this.setWestRoom(null);
        this.setEastRoom(null);
    }

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
}
