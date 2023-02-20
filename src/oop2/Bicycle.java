package oop2;

public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public int getWheelsCount () {
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
}
