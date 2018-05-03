package com.sutherlandpb.adventure.alternativefuel.Player;

import com.sutherlandpb.adventure.alternativefuel.rooms.NoRoom;
import com.sutherlandpb.adventure.alternativefuel.rooms.RoomInterface;
import com.sutherlandpb.adventure.alternativefuel.rooms.StartingRoom;
import org.springframework.stereotype.Component;

@Component
public class PlayerDataContainer {

    private RoomInterface currentRoom = new NoRoom();

    public String startFirstTime() {
        if (currentRoom instanceof NoRoom) {
            currentRoom = new StartingRoom();
            return currentRoom.start("You start your adventure... ");
        } else {
            return "You have already started your adventure";
        }

    }

    public RoomInterface getCurrentRoom() {
        return currentRoom;
    }

    public String setNextRoom(String enteringMessage, RoomInterface nextRoom) {
        return nextRoom.start(enteringMessage);
    }


}
