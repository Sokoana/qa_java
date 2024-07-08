import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionSexWithExpected {

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void testSexNoName() throws Exception{
        String sexLion = "Максим";
        boolean expected = false;
        Lion lion = new Lion(sexLion, feline);
        lion.doesHaveMane();
        assertEquals(expected, lion.doesHaveMane());
    }
}
