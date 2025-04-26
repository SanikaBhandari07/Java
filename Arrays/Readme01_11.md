# Linear Search :
    1) Array is not always sorted
    2) There is a key whose index we have to find in the given array
    
    Algo :
        traverse the whole array 
        if the element is present then return index
        else return -1;

    Time Complexity : o(n)

# Binary Search 
    1) Array is sorted
    2) left = 0  && right = arr.length-1
    3) mid = left + (right-left)/2

    if(arr[mid] == key) ...... return i
    if( key < arr[mid]) ...... search in left half .... left = 0      right = mid -1
    if( key > arr[mid]) ...... seach in other half .... left = mid+1  right = arr.length-1

    Time Complexity : o(logn)


# Reverse Array :
    2 4 6 8 10
    10 8 6 4 2

    1 2 3 4
    4 3 2 1

    here we have used 2 pointer approch

    i=0;  j=arr.length-1;

    while(i<j){
        --swap using temp
        i++;
        j--;
    }

    Time Complexity : o(n/2)

# Max Sub Arrays Sum

    1) Brute Force Appoch 
        Time complexity : o(n^3);

    2) Prefix Sum Array
        Time complexity : o(n^2);
        Space Complexity : o(n);

    3) Kadanes Algorithm
        Time complexity : o(n)
        Space complexity : o(1)

    1) Brute Force
        for i->(0 n)
            for j-> (i n)
                for k->(i j)

    2) Prefix Sum Array
                          0    1     2       3         4
        Array        :    1    3     5       7         9
    - Prefix Array   :    1    4     9       16        25
    -                     1   1+3  1+3+5   1+3+5+7    1+3+5+7+9

        find sum of sub array of index 2 to 4    // 5 7 9 : 21
        = prefix_sum (4) - pefix_sum(2-1)   
        = 1+3+5+7+9      - 1+3
        = 5+7+9
        = 21

    3) Kadanes Algo

        current_sum : Math.max(arr[i],  curr+arr[i])    
            if curr_sum  = -10   arr[i] = -3
            Then The subArray Starts from -3 
            because adding the element to the previous array is not good than 
            consideing single element  
            because if we consider the single element its sum is higher 


        max_sum : Math.max(curr,max)


