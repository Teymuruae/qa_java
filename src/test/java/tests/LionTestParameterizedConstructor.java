package tests;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTestParameterizedConstructor {

    private String sex;
    private boolean result;

    public LionTestParameterizedConstructor(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };

    }

    @Test
    public void lionConstructorTest() throws Exception {
        Lion lion = new Lion(sex, null, result);
        Assert.assertEquals(lion.doesHaveMane(), result);
    }
}
