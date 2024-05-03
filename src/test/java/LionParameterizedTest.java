import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private Feline feline;
    private final Boolean hasManeExpected;

    public LionParameterizedTest(String sex, Boolean hasManeExpected) {
        this.sex = sex;
        this.hasManeExpected = hasManeExpected;
    }
    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
    }
    @Parameterized.Parameters
    public static Object[][] hasManeData(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(hasManeExpected, lion.doesHaveMane());
    }
}
