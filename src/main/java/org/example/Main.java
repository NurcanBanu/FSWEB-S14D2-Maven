package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Lamp lamp = new Lamp(LampType.NEON, true, 95);
        Ceiling ceiling = new Ceiling(300, PaintColor.WHITE);
        Bed bed = new Bed("double", 2, 1, 2, 2);
        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");
        Carpet carpet = new Carpet(2, 3, PaintColor.GREEN);
        Wall[] walls = new Wall[] {northWall, eastWall, westWall, southWall};

        Bedroom bedroom = new Bedroom(lamp, eastWall, westWall, southWall, northWall, carpet, ceiling, "Yatak Odası", bed, new Wardrobe(2,2,50));
        bedroom.createBedroom();
    }

}