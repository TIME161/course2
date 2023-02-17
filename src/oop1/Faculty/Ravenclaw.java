package oop1.Faculty;

import oop1.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int intellectPoints;
    private int wisdomPoints;
    private int creationPoints;

    public Ravenclaw(String fullName, int spellPower, int transgressPower,
                     String facility, int intellectPoints,
                     int wisdomPoints, int creationPoints) {
        super(fullName, spellPower, transgressPower, facility);
        this.intellectPoints = intellectPoints;
        this.wisdomPoints = wisdomPoints;
        this.creationPoints = creationPoints;
    }

    public int getIntellectPoints() {
        return intellectPoints;
    }

    public void setIntellectPoints(int intellectPoints) {
        this.intellectPoints = intellectPoints;
    }

    public int getWisdomPoints() {
        return wisdomPoints;
    }

    public void setWisdomPoints(int wisdomPoints) {
        this.wisdomPoints = wisdomPoints;
    }

    public int getCreationPoints() {
        return creationPoints;
    }

    public void setCreationPoints(int creationPoints) {
        this.creationPoints = creationPoints;
    }
    @Override
    public String toString() {
        return
                "Полное имя: " + getFullName() + " Сила магии: "+ getSpellPower() + " Расстояние трансгресии: " + getTransgressPower() + " Факультет: " + getFacility() + " Очки ума: " + intellectPoints + " Очки мудрости: " + wisdomPoints + " Очки остроумия: " + creationPoints;
    }
}
