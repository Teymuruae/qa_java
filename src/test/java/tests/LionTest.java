package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    Feline feline;


    @Test(expected = Exception.class)
    public void lionConstructorExceptionTest() throws Exception {
        Lion lion = new Lion("unknown", feline, false);
    }


    @Test
    public void getKittensMethodInLionTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline, false);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodMethodInLionTest() throws Exception {

        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самка", feline, false);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline, false);
//
        boolean actualResult = lion.doesHaveMane();
        Assert.assertTrue(!actualResult);
    }


}

