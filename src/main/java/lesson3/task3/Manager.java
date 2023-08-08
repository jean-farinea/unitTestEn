package lesson3.task3;

public class Manager {
    private float basicSalary = 5000f;
    private float bonus = 500;


    public void changeBonus(int newBonus){
        this.bonus = newBonus;
    }

    public Manager(float basicSalary, float bonus) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }
}
