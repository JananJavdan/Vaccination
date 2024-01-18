package be.intecbrussel.AnimalShelter.service;

import intecbrussel.be.Vaccination.Animal;
import intecbrussel.be.Vaccination.AnimalShelter;
import intecbrussel.be.Vaccination.Disease;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AnimalShelterTest {
    private final AnimalShelter animalShelter;
    {
      this.animalShelter = new AnimalShelter();
    }


    @ParameterizedTest
    @MethodSource("testSortAnimalFactory")
    public void testSortAnimal(List<Animal> inputAnimals, List<Animal> expectedSortedAnimals) {
        AnimalShelter animalShelter = new AnimalShelter();

        for (Animal animal : inputAnimals) {
            animalShelter.addAnimal(animal);
        }
        animalShelter.sortAnimals();

        List<Animal> sortedAnimals = animalShelter.getAnimals();

        Assertions.assertEquals(expectedSortedAnimals, sortedAnimals);

    }
    public static Stream<Arguments>

        Animal dog = new Animal(true, true, 4, "Max dog1", 1);
        Animal cat = new Animal(false, true, 8, "Sasi cat1", 4);
        Animal monkey = new Animal(false, true, 10, "Masi monkey1", 7);

        animalShelter.addAnimal(dog);
        animalShelter.addAnimal(cat);
        animalShelter.addAnimal(monkey);

        animalShelter.sortAnimals();

    }
    @ParameterizedTest
    @MethodSource("animalFactory")
    public void testAddAnimal(Animal animal, int expectedAnimalCount){
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.addAnimal(animal);

        Assertions.assertEquals(expectedAnimalCount, animalShelter.countAnimals());

    }
    public static Stream<Arguments> animalFactory(){
        return Stream.of(
                Arguments.of(),
                Arguments.of()



        );
    }
    @ParameterizedTest
    @MethodSource("animalAndDiseaseFactory")
    public void testPrintAnimalsNotVaccinated(Animal animal, Disease disease, boolean expectedOutput){
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.addAnimal(animal);

        Assertions.assertEquals(expectedOutput, animal);
    }
    public static Stream<Arguments> animalAndDiseaseFactory() {
        return Stream.of(
                Arguments.of(new Animal ("NotVaccinated", false, "8", "Sasi cat1",3))
        );
    }




    @ParameterizedTest
    @MethodSource("testFindAnimalByAnimalNumberFactory")
    public void testFindAnimalByAnimalNumber(Animal testAnimal, boolean expectedResult){
        AnimalShelter animalShelter = new AnimalShelter();
       animalShelter.addAnimal(testAnimal);

       boolean actualResult = animalShelter.findAnimal(testAnimal.getAnimalNumber()) != null;
       Assertions.assertEquals(expectedResult, actualResult);


    }
    public static Stream<Arguments> testFindAnimalByAnimalNumberFactory(){
        Stream.of(
                Arguments.of(new Animal("NotVaccinated",true,4,"Mishi cat2",3 ),true),


        );
    }
    @ParameterizedTest
    @MethodSource("testsortingFactory")
    public void  testSortAnimalsByName(List<Animal> animalNumber, List<Animal> expectedSortedAnimals) {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.setAnimals(new ArrayList<>(animalNumber));
        animalShelter.sortAnimalsByName();
        List<Animal> sortedAnimals = animalShelter.getAnimals();

    }
    public static Stream<Arguments> testsortingFactory(){
        return Stream.of(
                Arguments.of(new Animal("NotVaccinated",false ,5,"Lucy dog3", 4)),

    }
    @Test
    public void testFindOldestAnimal(){
        Animal oldestAnimal = animalShelter.findOldestAnimal();

        Assertions.assertEquals();
    }

}
