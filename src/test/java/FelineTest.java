import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class FelineTest {

    Feline feline = new Feline();


    @Test
    public void testFelineGetFamily(){
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetKittens(){
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testFelineEatMeat() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        System.out.println("Тест testFelineEatMeat. Ожидаемое значение " + expected);
        System.out.println("Тест testFelineEatMeat. Фактическое значение " + actual);
        assertEquals(expected, actual);
    }
}