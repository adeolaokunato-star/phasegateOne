def check_number(array, target):
    result = []
    for index in range(0, len(array)):
        for count in range(0, len(array)):
            if array[index] + array[count] == target:
                result.append(array[index])
                result[0] = array[index]
                result[1] = array[count]
    return result                    
