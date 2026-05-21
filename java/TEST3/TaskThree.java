public class TaskThree{
    public static int [] largestandsmallest(int[] number){
        int largest = 0;
        for(int index = 0; index < number.length; index++){
            for(int count = index + 1; count < number.length; count++){
                if(number[index] > number[count]){
                    largest = number[index];
                }
            }        
        }
        int smallest = 0;
        for(int count = 0; count < number.length; count++){
            for(int index = count + 1; index < number.length; index++){
                if(number[count] < number[index]){
                    smallest = number[count];
                }
            }
        }
        int size = largest - smallest;
        int[] array = new array[size + 1];
        int sum = 0;
        for(int count = smallest; count <= largest; count++){
            for(int index = sum; index <= size; index++){
                array[number] = count; 
            }
        sum = sum + 1;
        }
     return array;
    }
}            

