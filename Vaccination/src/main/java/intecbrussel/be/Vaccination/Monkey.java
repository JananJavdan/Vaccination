package intecbrussel.be.Vaccination;

import java.util.Map;

public class Monkey extends Animal{
    private boolean isHyperActive;

    public Monkey(boolean isHyperActive) {
        this.isHyperActive = isHyperActive;
    }

    public Monkey(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber, boolean isHyperActive) {
        super(isVaccinated, isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;
    }

    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }

    @Override
    public void treatAnimal() {

    }

    @Override
    public boolean vaccinateAnimal(Disease disease) {
        return false;
    }
}
