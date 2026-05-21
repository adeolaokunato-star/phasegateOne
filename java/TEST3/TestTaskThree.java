import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTaskThree{
    @Test
    public void TestThatLargestWorks(){
    int [] number ={14, 9, 6, 5, 8, 10};    
    int expected = 14;
    int actual = TaskThree.largestandsmallest(number);
    assertArrayEquals(actual, expected);
    }
    @Test
    public void TestThatSmallestWorks(){
    int [] number ={14, 9, 6, 5, 8, 10};    
    int expected = 5;
    int actual = TaskThree.largestandsmallest(number);
    assertArrayEquals(actual, expected);
    }
    @Test
    public void TestThatSmallestToLargestWorks(){
    int [] number ={14, 9, 6, 5, 8, 10};    
    int expected = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    int actual = TaskThree.largestandsmallest(number);
    assertArrayEquals(actual, expected);
    }
}
