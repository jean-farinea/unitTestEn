package lesson5.task5;

public class Vehicle {

    private boolean engineStarted;

    public Vehicle(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    protected void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        } else {
            System.out.println("Engine is already started!");
        }
    }

    protected void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        } else {
            System.out.println("Engine is already stopped!");
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }
}