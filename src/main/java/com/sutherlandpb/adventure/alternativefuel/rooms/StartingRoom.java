package com.sutherlandpb.adventure.alternativefuel.rooms;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StartingRoom extends BaseRoom{

    @Autowired
    private AutoShopRoom autoShopRoom;

    @PostConstruct
    public void setRooms() {
        this.setNorthRoom(autoShopRoom);
        this.setSouthRoom(null);
        this.setWestRoom(null);
        this.setEastRoom(null);
    }

    public StartingRoom(@Autowired PlayerDataContainer playerDataContainer) {
        this.playerDataContainer = playerDataContainer;
    }

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
        return "It's the same old office where you clock in and out.  There is an out-of-date calendar on the wall with a picture of a bright red PX450, the car looks fast.  There is a door to the North.";
    }
}
