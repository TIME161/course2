package oop2;

public class Truck extends Vehicle {
    private int daysGarantee;
   private String garanteeStatus;

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public Truck(String modelName, int wheelsCount, int daysGarantee, String garanteeStatus) {
        super(modelName, wheelsCount);
        this.daysGarantee = daysGarantee;
        if (this.daysGarantee< 1){
            this.garanteeStatus = "Просрочена";
        } else this.garanteeStatus = "Активна";
    }

    public int getDaysGarantee() {
        return daysGarantee;
    }

    public void setDaysGarantee(int daysGarantee) {
        this.daysGarantee = daysGarantee;
    }

    public String getGaranteeStatus() {
        return garanteeStatus;
    }

    public void setGaranteeStatus(String garanteeStatus) {
        this.garanteeStatus = garanteeStatus;
    }

    public int getWheelsCount() {
        int wheelsCount = super.getWheelsCount();
        return wheelsCount;
    }

    public String getModelName() {
        String modelName = super.getModelName();
        return modelName;
    }

    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    public void setWheelsCount(int wheelsCount) {
        super.setWheelsCount(wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    public void garanteeIsDown() {
        System.out.println("Гарантия на ваш "+ super.getModelName() + ": " + this.garanteeStatus);
    }
}
