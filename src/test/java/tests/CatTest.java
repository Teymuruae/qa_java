package tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundMethodInCatTest() {
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
      Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
  public void getFoodMethodInCatTest() throws Exception {
      Cat cat = new Cat(feline);
      Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
      List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
      List<String> actualResult = cat.getFood();

      Assert.assertEquals(expectedResult,actualResult);
    }

    @Test (expected = Exception.class)
  public void getFoodMethodInCatThrowExceptionTest() throws Exception{
      Cat cat = new Cat(feline);
      Mockito.when(feline.eatMeat()).thenThrow(new Exception());
      cat.getFood();
    }
}
