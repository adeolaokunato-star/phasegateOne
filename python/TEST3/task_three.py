def largest_to_smallest(number):
    largest = 0
    for index in range(0, len(number)):
        for count in range(index +1, len(number)):
            if(number[index] > number[count]):
                largest = number[index]
    smallest = 0
    for count in range(0, len(number)):
        for index in range(count +1, len(number)):
            if(number[count] < number[index]):
            smallest = number[count]
    size = largest - smallest
    array = number[size + 1]
    sum = 0
    for count in range(smallest, largest):
        for index in range(sum, size):
            array[number] = count
    sum = sum + 1
return number                
                    
