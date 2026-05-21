import java.util.Arrays;
public class TaskOne{
    public static int [] numbertodivide(int[] array, int target){
        int [] result = new int [2];
        for(int count = 0; count < array.length; count++){
            for(int index = count + 1; index < array.length; index++){
                if(array[count] + array[index] == target){
                    result[0] = array[count];
                    result[2] = array[index];
                }
                
            }
        }
        return result;
    }
}




