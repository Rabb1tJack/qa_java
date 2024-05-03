import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    @Test
    public void getSoundTest(){
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void getFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, cat.getFood());
    }
    @Test
    public void getSound(){
        assertEquals("Мяу", cat.getSound());
    }
}
