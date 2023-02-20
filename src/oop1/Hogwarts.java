package oop1;

public class Hogwarts {
    final private  String fullName;
    private int spellPower;
    private int transgressPower;
    private String facility;

    public Hogwarts(String fullName, int spellPower, int transgressPower, String facility) {
        this.fullName = fullName;
        this.spellPower = spellPower;
        this.transgressPower = transgressPower;
        this.facility = facility;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressPower() {
        return transgressPower;
    }

    public void setTransgressPower(int transgressPower) {
        this.transgressPower = transgressPower;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }
    }