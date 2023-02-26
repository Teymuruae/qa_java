package tests;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private String animalKind;
    private List<String> expectedResult;

    public AnimalParameterizedTest(String animalKind, List<String> expectedResult) {
        this.animalKind = animalKind;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][]getData(){
        return new Object[][]{
                { "Хищник", List.of("Животные", "Птицы", "Рыба") },
                {"Травоядное", List.of("Трава", "Различные растения")}
        };
    }

    @Test
    public void getFoodMethodInAnimalTest() throws Exception {
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood(animalKind);
        Assert.assertEquals(expectedResult, actualResult);
    }


}
