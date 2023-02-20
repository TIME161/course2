package oop1.Faculty;

import oop1.Hogwarts;

public class Gryffindor extends Hogwarts {
    private int nobilityPoints;
    private int honorPoints;
    private int braveryPoints;

    public Gryffindor(String fullName, int spellPower, int transgressPower,
                      String facility, int nobilityPoints, int honorPoints,
                      int braveryPoints) {
        super(fullName, spellPower, transgressPower, facility);
        this.nobilityPoints = nobilityPoints;
        this.honorPoints = honorPoints;
        this.braveryPoints = braveryPoints;
    }

    public int getNobilityPoints() {
        return nobilityPoints;
    }

    public void setNobilityPoints(int nobilityPoints) {
        this.nobilityPoints = nobilityPoints;
    }

    public int getHonorPoints() {
        return honorPoints;
    }

    public void setHonorPoints(int honorPoints) {
        this.honorPoints = honorPoints;
    }

    public int getBraveryPoints() {
        return braveryPoints;
    }

    public void setBraveryPoints(int braveryPoints) {
        this.braveryPoints = braveryPoints;
    }

    @Override
    public String toString() {
        return
                "Полное имя: " + getFullName() + " Сила магии: "+ getSpellPower() + " Расстояние трансгресии: " + getTransgressPower() + " Факультет: " + getFacility() + " Очки благородства: " + nobilityPoints + " Очки чести: " + honorPoints + " Очки храбрости: " + braveryPoints;
    }
}
