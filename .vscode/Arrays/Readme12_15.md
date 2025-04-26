# Traping Rain Water

    Problem Statement :
        Given an array of non-negative integers representing the heights of bars, calculate how much water can be trapped between them after a rain.

              __             __                __
     _       |  |__         |  |__            |  |   __
    | |      |  |  |        |  |  |__         |  |__|  |
    | |      |  |  |        |  |  |  |        |  |  |  |

    1. If No of Blocks are 1 or 2                   : no water stored
    2. If the building are ascending or descending  : no water stored

    3. For each block for calculating the stored water
        we need its left maximum height & right maximum height
        and min of (left_max, right_max) - height[i] is the stored water

    We need :
        1. left max height aray
        2. right max height array
        3. min(left[i], right[i])-height[i] is the stored volume


    Time Complexity  :  o(n)
    space complexity :  o(n)


# Buy And Sell Shares :

    Problem Statement :
        You are given an array of integers where each integer represents the price of a stock on a particular day. You want to find the maximum profit you can achieve by performing at most one buy and one sell operation. Note that you cannot sell a stock before you buy it.


        when the stock has very less price at that time : buy
        when the stock price is high                    : sell


        first stack should be buy

        buy : Math.min (buy, current_price)
            if current price is less then previous stock we will buy that stock
            if current price is more than previous stock then we will not buy that stock

        Profit : first day we will not receive any profit // profit = 0
                 after the first day it may be 
                 profit = Math.max ( profit, stock[i]-buy);

        
    ex    :    4    2     5      1    
    Buy   :    b    b=2   b=2   b=1  
    sell  :    p=0  p=0   p=5   p=5   

    Time Complexity : o(n)
    space complexity : o(1)

# Rotate Array with K

    Problem Statement :
        Given an array of integers and an integer k, rotate the array to the right by k steps


    steps:
        1. Reverse full array
        2. Reverse the array from    0            -    arr.length-k-1
        3. Reverse the array from    arr.length-k -    arr.length-1


    1 2 3 4 5   k = 3


    5 4 3 2 1
    3 4 5 2 1
    3 4 5 1 2 

    Time complexity : o(n)


# Merge 2 Sorted Arrays:

    int arr1[] = {1,5,6,0,0,0,0};
    int arr2[] = {2,3,4,7};

    final output :
    arr1 = 1,2,3,4,5,6,7

    space complexity : o(1)
    time complexity : o(n)

    Process:
    start from the last of 2 arrays and fill the values from the last of arr1

    1. declare int i = m ... m = fist non zero elements in arr1
    2. declare int j = arr2.length  
    3. loop from the last of arr1
    
        if(i>=0 && (j<0 || arr1[i] > arr2[j])) {
            add arr1[i] in arr1[k]
            i--;
        }
            
        else{
            if(j>=0){
                add arr2[j] in arr1[k]
                j--;
            }
        }
      


