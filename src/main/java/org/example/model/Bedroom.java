package org.example.model;

public class Bedroom extends Room{
    private String name;
    private Bed bed;
    private Wardrobe wardrobe;

    public Bedroom(Lamp lamp, Wall wall1, Wall wall2, Wall wall4, Wall wall3, Carpet carpet, Ceiling ceiling, String name, Bed bed, Wardrobe wardrobe) {
        super(lamp, wall1, wall2, wall4, wall3, carpet, ceiling);
        this.name = name;
        this.bed = bed;
        this.wardrobe = wardrobe;
    }

    public void createBedroom() {
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        bed.make();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();

    }

    public String getName() {
        return this.name;
    }

    public Bed getBed() {
        return this.bed;
    }

    public Wardrobe getWardrobe() {
        return this.wardrobe;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                ", room = " + super.toString() +
                '}';
    }
}
