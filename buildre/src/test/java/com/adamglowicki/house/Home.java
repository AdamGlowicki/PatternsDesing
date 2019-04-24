package com.adamglowicki.house;

public class Home {
    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String doors;
    private String garage;
    private String windows;

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Home{");
        sb.append("walls='").append(walls).append('\'');
        sb.append(", floors='").append(floors).append('\'');
        sb.append(", rooms='").append(rooms).append('\'');
        sb.append(", roof='").append(roof).append('\'');
        sb.append(", doors='").append(doors).append('\'');
        sb.append(", garage='").append(garage).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
