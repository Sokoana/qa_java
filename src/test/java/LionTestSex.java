package lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestSex {

    private final String sexLion;
    private final boolean expected;


    public LionTestSex(String sexLion, boolean expected){
        this.sexLion = sexLion;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSexOfLion(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}

        };
    }

    @Mock
    Feline feline;
    //замокали объект типа Feline

    @Test
    public void testSex() throws Exception{
        Lion lion = new Lion(sexLion, feline);

        boolean c = lion.doesHaveMane();

        System.out.println(c);
        assertEquals(expected,c);

    }
}