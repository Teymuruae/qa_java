package tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline = new Feline();

    @Test
    public void eatMeatMethodInFelineTest() throws Exception {

        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = feline.eatMeat();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(expected = Exception.class)
    public void eatMeatMethodInFelineTestThrowsException() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenThrow(new Exception());
        feline.eatMeat();


    }

    @Test
    public void getFamilyMethodInFelineTest() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensMethodWithoutParamsInFelineTest() {
        int expectedResult = 1;
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        int actualResutl = feline.getKittens();

        Assert.assertEquals(expectedResult, actualResutl);
    }

    @Test
    public void getKittensMethodWithParamsInFelineTest() {
        int expectedResult = 20;
        int actualResult = feline.getKittens(20);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
