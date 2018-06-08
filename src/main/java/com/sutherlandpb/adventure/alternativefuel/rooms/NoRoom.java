package com.sutherlandpb.adventure.alternativefuel.rooms;

import org.springframework.stereotype.Component;

@Component
public class NoRoom implements RoomInterface {
    @Override
    public String getName() {
        return "Start";
    }

    @Override
    public String start(String enteringMessage) {
        //no start, this is no room
        return null;
    }

    @Override
    public String look() {
        return "you can't look around, type \"start\" to start your adventure";
    }

    @Override
    public String goNorth() {
        return "you can't go North, type \"start\" to start your adventure";
    }

    @Override
    public String goSouth() {
        return "you can't go South, type \"start\" to start your adventure";
    }

    @Override
    public String goWest() {
        return "you can't go West, type \"start\" to start your adventure";
    }

    @Override
    public String goEast() {
        return "you can't go East, type \"start\" to start your adventure";
    }
}
