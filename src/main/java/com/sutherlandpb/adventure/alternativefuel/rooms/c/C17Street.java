package com.sutherlandpb.adventure.alternativefuel.rooms.c;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import com.sutherlandpb.adventure.alternativefuel.rooms.BaseRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class C17Street extends BaseRoom {

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @Autowired
    private C18AutoShopRoom c18AutoShopRoom;

    @PostConstruct
    public void setRooms() {
        this.setNorthRoom(null);
        this.setSouthRoom(c18AutoShopRoom);
        this.setWestRoom(null);
        this.setEastRoom(null);
    }

    @Override
    public String getName() {
        return "Street";
    }

    @Override
    public String start( String enteringMessage) {
        return enteringMessage + "You are on the street outside the mechanic shop.";
    }

    @Override
    public String look() {
        return "The street dead-ends here, you can go East, or South back in to the shop.";
    }

}
