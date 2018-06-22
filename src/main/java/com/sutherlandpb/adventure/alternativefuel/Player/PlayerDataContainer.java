package com.sutherlandpb.adventure.alternativefuel.Player;

import com.sutherlandpb.adventure.alternativefuel.rooms.NoRoom;
import com.sutherlandpb.adventure.alternativefuel.rooms.RoomInterface;
import com.sutherlandpb.adventure.alternativefuel.rooms.c.C19StartingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PlayerDataContainer {

    @Autowired
    private NoRoom noRoom;

    @Autowired
    private C19StartingRoom c19StartingRoom;

    private RoomInterface currentRoom;

    @PostConstruct
    public void init() {
        currentRoom = noRoom;
    }

    public String startFirstTime() {
        if (currentRoom instanceof NoRoom) {
            currentRoom = c19StartingRoom;
            return currentRoom.start("You start your adventure... ");
        } else {
            return "You have already started your adventure";
        }

    }

    public RoomInterface getCurrentRoom() {
        return currentRoom;
    }

    public String setNextRoom(String enteringMessage, RoomInterface nextRoom) {
        currentRoom = nextRoom;
        return nextRoom.start(enteringMessage);
    }


}
