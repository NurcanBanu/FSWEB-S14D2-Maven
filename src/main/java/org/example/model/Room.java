package org.example.model;

public class Room {
    private Lamp lamp;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Carpet carpet;

    public Room(Lamp lamp, Wall wall1, Wall wall2, Wall wall4, Wall wall3, Carpet carpet, Ceiling ceiling) {
        this.lamp = lamp;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall4 = wall4;
        this.wall3 = wall3;
        this.carpet = carpet;
        this.ceiling = ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        return "Room{" +
                "wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", ceiling=" + ceiling +
                ", carpet=" + carpet +
                '}';
    }
}
