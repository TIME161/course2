package oop1;

import oop1.Faculty.Gryffindor;
import oop1.Faculty.Hufflepuff;
import oop1.Faculty.Ravenclaw;
import oop1.Faculty.Slytherin;

public class workspace {
    public static void comparisonOfCommonParameters( Hogwarts one,  Hogwarts two) {
        int summOne = one.getSpellPower() + one.getTransgressPower();
        int summTwo = two.getSpellPower() + two.getTransgressPower();
        if (summOne > summTwo) {
            System.out.println(one.getFullName() + " Сильнее чем " + two.getFullName());
        } else {System.out.println(two.getFullName() + " Сильнее чем " + one.getFullName());
        }
    }

    public static void comparisonOfSlytherinParameters( Slytherin one,  Slytherin two) {
        int summOne = one.getCunningPoints() + one.getResolvePoints() + one.getAmbitionPoints()
                                             + one.getInventivenessPoints() + one.getLustForPowerPoints();
        int summTwo = two.getCunningPoints() + two.getResolvePoints() + two.getAmbitionPoints()
                                             + two.getInventivenessPoints() + two.getLustForPowerPoints();
        if (summOne > summTwo) {
            System.out.println(one.getFullName() + " Сильнее чем " + two.getFullName());
        } else {System.out.println(two.getFullName() + " Сильнее чем " + one.getFullName());
        }
    }

    public static void comparisonOfGryffindorParameters( Gryffindor one,  Gryffindor two) {
        int summOne = one.getNobilityPoints() + one.getHonorPoints() + one.getBraveryPoints();
        int summTwo = two.getNobilityPoints() + two.getHonorPoints() + two.getBraveryPoints();
        if (summOne > summTwo) {
            System.out.println(one.getFullName() + " Сильнее чем " + two.getFullName());
        } else {System.out.println(two.getFullName() + " Сильнее чем " + one.getFullName());
        }
    }

    public static void comparisonOfRavenclawParameters( Ravenclaw one,  Ravenclaw two) {
        int summOne = one.getCreationPoints() + one.getWisdomPoints() + one.getIntellectPoints();
        int summTwo = two.getCreationPoints() + two.getWisdomPoints() + two.getIntellectPoints();
        if (summOne > summTwo) {
            System.out.println(one.getFullName() + " Сильнее чем " + two.getFullName());
        } else {System.out.println(two.getFullName() + " Сильнее чем " + one.getFullName());
        }
    }

    public static void comparisonOfHufflepuffParameters( Hufflepuff one,  Hufflepuff two) {
        int summOne = one.getHonestyPoints() + one.getLoyaltyPoints() + one.getIndustriousnessPoints();
        int summTwo = two.getHonestyPoints() + two.getLoyaltyPoints() + two.getIndustriousnessPoints();
        if (summOne > summTwo) {
            System.out.println(one.getFullName() + " Сильнее чем " + two.getFullName());
        } else {System.out.println(two.getFullName() + " Сильнее чем " + one.getFullName());
        }
    }

    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Potter", 78, 63, "Гриффиндор", 85, 85, 95);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 87, 85, "Гриффиндор", 87, 88, 84);
        Gryffindor ron = new Gryffindor("Ron Weasley", 67, 69, "Гриффиндор", 86, 83, 79);
        Slytherin draco = new Slytherin("Draco Malfoy", 68, 75, "Слизерин", 72, 62, 81, 78, 83);
        Slytherin graham = new Slytherin("Graham Montagu", 61, 60, "Слизерин", 63, 66, 73, 70, 70);
        Slytherin gregory = new Slytherin("Gregory Goyle", 63, 58, "Слизерин", 67, 62, 72, 74, 63);
        Ravenclaw zhoy = new Ravenclaw("Zhou Chang", 65, 48, "Когтевран", 84, 78, 82);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 58, 52, "Когтевран", 80, 72, 83);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 71, 37, "Когтевран", 86, 70, 84);
        Hufflepuff zacharias = new Hufflepuff("Zacharias Smith", 62, 56, "Пуффендуй", 74, 79, 68);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 78, 81, "Пуффендуй", 76, 81, 75);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 71, 55, "Пуффендуй", 82, 76, 81);


        System.out.println("harry.getHonorPoints() = " + harry.getHonorPoints());
        harry.setHonorPoints(87);
        System.out.println("harry.getHonorPoints() = " + harry.getHonorPoints());


        comparisonOfCommonParameters(harry,zhoy);
        comparisonOfSlytherinParameters(draco, gregory);
        comparisonOfGryffindorParameters(hermione, harry);
        comparisonOfRavenclawParameters(zhoy, padma);
        comparisonOfHufflepuffParameters(cedric, justin);

    }
    }

