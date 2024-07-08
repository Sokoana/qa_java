import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionGetFood {

    @Mock
     private Feline feline;
    //замокали объект типа Feline

    @Test()
    public void testLionGetFood() throws Exception {
        Lion lionTest = new Lion("Самец", feline);

        List<String> exception = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> actual = lionTest.getFood();

        System.out.println("Ожидаемый результат " + exception);
        System.out.println("Фактический результат " + actual);
        assertEquals(exception, actual);

    }
}