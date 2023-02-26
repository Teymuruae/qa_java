package tests;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void getFamilyMethodInAnimalTest(){
        Animal animal = new Animal();
        String expectedResult = "Существует несколько семейств: " +
                "заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test(expected = Exception.class)
    public void getFoodMethodThrowExceptionTest() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Unknown");
    }
}
