public class TaskTwo{
    public static int [] dupilcate(int[] number){
        for(int index = 0; index < number.length; index++){
            for(int count = 1; count < number.length; count++){
                for(int counter = count + 1; counter < number.length; counter++){
                    number[count] = number[count];
                   
                }
            }
        }
    return number;
    }    
}    
