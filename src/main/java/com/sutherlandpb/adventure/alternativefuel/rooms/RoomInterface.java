package com.sutherlandpb.adventure.alternativefuel.rooms;

public interface RoomInterface {


    /**
     * returns the name of the room
     * @return Display Name of the room
     */
    public String getName();

    /**
     * Room Start
     *
     * @return Start Text of the room
     */
    public String start(String enteringMessage);

    /**
     * Look around the room
     *
     * @return Description of the room
     */
    public String look();

    /**
     * Go North out of the room
     *
     * @return text from the next room or message saying you can't navigate
     */
    public String goNorth();

    /**
     * Go South out of the room
     *
     * @return text from the next room or message saying you can't navigate
     */
    public String goSouth();

    /**
     * Go West out of the room
     *
     * @return text from the next room or message saying you can't navigate
     */
    public String goWest();

    /**
     * Go East out of the room
     *
     * @return text from the next room or message saying you can't navigate
     */
    public String goEast();


}
