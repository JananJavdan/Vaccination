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

    //zorgt ervoor dat een animal clean gemaakt wordt. Indien je aan het werken bent met een cat, dog of monkey, zorg er dan
//voor dat de treatAnimal methode ook de hyperactivity, de longnails en de foulbreath problemen oplost. (op false zet)
    @Override
    public void treatAnimal() {
        setClean(true);
        setHyperActive(false);
    }

//Deze method zal een dier vaccineren voor een bepaalde ziekte. Zet er de boolean dus voor op true
    @Override
    public boolean vaccinateAnimal(Disease disease) {
        Map<Disease, Boolean> vaccinationStatus = getIsVaccinated();
        if (vaccinationStatus != null){
            vaccinationStatus.put(disease, true);
            return true;
        }
        return false;
    }
}
