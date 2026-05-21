import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTaskOne{
    @Test
    public void TestThatArrayGetsTarget(){
    int [] array ={8, 6, 12, 4, -2};
    int target = 0;    
    int expected = {8, -2};
    int actual = TaskOne.numbertodivide(array, target);
    assertArrayEquals(expected, actual);
    }
}
