package oop1.Faculty;

import oop1.Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunningPoints;
    private int resolvePoints;
    private int ambitionPoints;
    private int inventivenessPoints;
    private int lustForPowerPoints;

    public Slytherin(String fullName, int spellPower, int transgressPower, String facility,
                                        int cunningPoints, int resolvePoints, int ambitionPoints,
                                            int inventivenessPoints, int lustForPowerPoints) {
        super(fullName, spellPower, transgressPower, facility);
        this.cunningPoints = cunningPoints;
        this.resolvePoints = resolvePoints;
        this.ambitionPoints = ambitionPoints;
        this.inventivenessPoints = inventivenessPoints;
        this.lustForPowerPoints = lustForPowerPoints;
    }

    public int getCunningPoints() {
        return cunningPoints;
    }

    public void setCunningPoints(int cunningPoints) {
        this.cunningPoints = cunningPoints;
    }

    public int getResolvePoints() {
        return resolvePoints;
    }

    public void setResolvePoints(int resolvePoints) {
        this.resolvePoints = resolvePoints;
    }

    public int getAmbitionPoints() {
        return ambitionPoints;
    }

    public void setAmbitionPoints(int ambitionPoints) {
        this.ambitionPoints = ambitionPoints;
    }

    public int getInventivenessPoints() {
        return inventivenessPoints;
    }

    public void setInventivenessPoints(int inventivenessPoints) {
        this.inventivenessPoints = inventivenessPoints;
    }

    public int getLustForPowerPoints() {
        return lustForPowerPoints;
    }

    public void setLustForPowerPoints(int lustForPowerPoints) {
        this.lustForPowerPoints = lustForPowerPoints;
    }
    @Override
    public String toString() {
        return
                "Полное имя: " + getFullName() + " Сила магии: "+ getSpellPower() +
                " Расстояние трансгресии: " + getTransgressPower() + " Факультет: " + getFacility() +
                " Очки хитрости: " + cunningPoints + " Очки решительности: " + resolvePoints +
                " Очки амбициозности: " + ambitionPoints + " Очки находчивости: " + inventivenessPoints +
                " Очки жажды власти: " + lustForPowerPoints;
    }
}
