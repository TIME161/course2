package oop1.Faculty;

import oop1.Hogwarts;

public class Hufflepuff extends Hogwarts {
   private int industriousnessPoints;
   private int loyaltyPoints;
   private int honestyPoints;

    public Hufflepuff(String fullName, int spellPower, int transgressPower,
                      String facility, int industriousnessPoints,
                      int loyaltyPoints, int honestyPoints) {
        super(fullName, spellPower, transgressPower, facility);
        this.industriousnessPoints = industriousnessPoints;
        this.loyaltyPoints = loyaltyPoints;
        this.honestyPoints = honestyPoints;
    }

    public int getIndustriousnessPoints() {
        return industriousnessPoints;
    }

    public void setIndustriousnessPoints(int industriousnessPoints) {
        this.industriousnessPoints = industriousnessPoints;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getHonestyPoints() {
        return honestyPoints;
    }

    public void setHonestyPoints(int honestyPoints) {
        this.honestyPoints = honestyPoints;
    }
    @Override
    public String toString() {
        return
                "Полное имя: " + getFullName() + " Сила магии: "+ getSpellPower() + " Расстояние трансгресии: " + getTransgressPower() + " Факультет: " + getFacility() + " Очки трудолюбия: " + industriousnessPoints + " Очки верности: " + loyaltyPoints + " Очки честности: " + honestyPoints;
    }
}
