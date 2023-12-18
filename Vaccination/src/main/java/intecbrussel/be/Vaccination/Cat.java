package intecbrussel.be.Vaccination;

import java.util.Map;

public class Cat extends Animal{
    private boolean hasFoulBreath;

    public Cat(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    public Cat(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isVaccinated, isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {

    }

    @Override
    public boolean vaccinateAnimal(Disease disease) {
        return false;
    }
}
