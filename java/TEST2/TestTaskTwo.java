import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTaskOne{
    @Test
    public void TestThatNumbersAreSorted(){
    int [] number ={9, 5, 1, 9, 4, 5, 1, 7};    
    int expected = {9, 5, 1, 4, 7};
    int actual = TaskTwo.dupilcate(number);
    assertArrayEquals(expected, actual);
    }
}














