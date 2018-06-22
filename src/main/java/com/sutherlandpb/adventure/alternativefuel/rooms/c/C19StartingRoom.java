package com.sutherlandpb.adventure.alternativefuel.rooms.c;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import com.sutherlandpb.adventure.alternativefuel.rooms.BaseRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class C19StartingRoom extends BaseRoom {

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @Autowired
    private C18AutoShopRoom c18AutoShopRoom;

    @PostConstruct
    public void setRooms() {
        this.setNorthRoom(c18AutoShopRoom);
        this.setSouthRoom(null);
        this.setWestRoom(null);
        this.setEastRoom(null);
    }

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
        return "It's the same old office where you clock in and out.  There is an out-of-date calendar on the wall with a picture of a bright red PX450, the car looks fast.  There is a door to the North.";
    }
}
