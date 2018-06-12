package com.sutherlandpb.adventure.alternativefuel.rooms;

import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseRoom implements RoomInterface{

    @Autowired
    private PlayerDataContainer playerDataContainer;

    private RoomInterface northRoom;
    private RoomInterface southRoom;
    private RoomInterface eastRoom;
    private RoomInterface westRoom;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String start(String enteringMessage) {
        return null;
    }

    @Override
    public String look() {
        return null;
    }

    @Override
    public String goNorth() {
        if (northRoom == null) {
            return "You can't go North!";
        }
        return playerDataContainer.setNextRoom("You go North... ", northRoom);
    }

    @Override
    public String goSouth() {
        if (southRoom == null) {
            return "You can't go South!";
        }
        return playerDataContainer.setNextRoom("You go South... ", southRoom);
    }

    @Override
    public String goWest() {
        if (westRoom == null) {
            return "You can't go West!";
        }
        return playerDataContainer.setNextRoom("You go West... ", westRoom);

    }

    @Override
    public String goEast() {
        if (eastRoom == null) {
            return "You can't go East!";
        }
        return playerDataContainer.setNextRoom("You go East... ", eastRoom);
    }

    public RoomInterface getNorthRoom() {
        return northRoom;
    }

    public void setNorthRoom(RoomInterface northRoom) {
        this.northRoom = northRoom;
    }

    public RoomInterface getSouthRoom() {
        return southRoom;
    }

    public void setSouthRoom(RoomInterface southRoom) {
        this.southRoom = southRoom;
    }

    public RoomInterface getEastRoom() {
        return eastRoom;
    }

    public void setEastRoom(RoomInterface eastRoom) {
        this.eastRoom = eastRoom;
    }

    public RoomInterface getWestRoom() {
        return westRoom;
    }

    public void setWestRoom(RoomInterface westRoom) {
        this.westRoom = westRoom;
    }
}
