package com.sutherlandpb.adventure.alternativefuel.rooms.c;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import com.sutherlandpb.adventure.alternativefuel.rooms.BaseRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class C18AutoShopRoom extends BaseRoom {

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @Autowired
    private C19StartingRoom c19StartingRoom;

    @Autowired
    private C17Street c17Street;

    @PostConstruct
    public void setRooms() {
        this.setNorthRoom(c17Street);
        this.setSouthRoom(c19StartingRoom);
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
