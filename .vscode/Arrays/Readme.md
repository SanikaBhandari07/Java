
# import java.util.Arrays;

# Arrays : 
    Array is a fixed data Structure which stores the homogeneous elemenets
    The elements are stored in a contigeous memory locations
    The size is needed to create the array
    
# Types : 
    1) 1-D array
    2) Multidimensional Array

# Limitation : 
    1) Fixed Size   (Size cant be chnaged)
    2) needs contigeous memory to store the elements ( limit its use for very large arrays)

# Creation :
    int[] numbers = new int[5];        // Creates an array of integers with 5 elements
    int[] values = {1, 2, 3, 4, 5};    // Initializes with specific values


    int[][] matrix = new int[3][4];    // 3 rows, 4 columns
    int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 



    int[][][] cube = new int[3][4][5];      // 3 layers, 4 rows, 5 columns
    int[][][] values = {
        {{1, 2, 3}, {4, 5, 6}}, 
        {{7, 8, 9}, {10, 11, 12}}, 
        {{13, 14, 15}, {16, 17, 18}}
    };


# Use 
    Mostly use of 2D and 3d Arrays

# 2D Array :

    1) Image Processing : 
    
Images are represented as grids of pixels, where each pixel has color values (e.g., RGB). 
A 2D array can store these values

    2) Games : Tic-Tac-Toe, Chess
    3)Databases or spreadsheets
    4) Routing & Path Finding
Navigation systems, like GPS, can use 2D arrays to model grids of locations. 
Algorithms (Dijkstra’s, A*) use these grids to find the shortest or optimal paths between points.


# 3D Array

    1) 3D Graphics and Modeling
In 3D graphics, objects are represented in three dimensions (x, y, z)

    2) Medical Imaging (e.g., MRI or CT Scans):
    3) Scientific Simulations:  Physics simulations, climate modeling
    4) Deep Learning and Neural Networks:

# Built-In Methods
    arr1[] = {1,3,5,7,9};
    1) Arrays.toString()  : conver array to string  [1, 2, 3]   //str.length() = 9     : o(n)
    2) Arrays.sort()      : sort the array in ascending order                   : o(nlogn)   
    3) Arrays.binarySearch(arr,key)                                             : o(logn)
    4) Arrays.equals(arr1, arr2)                                                : o(n)
    5) Arrays.fill(arr,12) : all the elements are 12                            : o(n)
    6) Arrays.copyOf(arr1,ending_index)                          :o(n) n is a size of ending index
        if arr2[] = {11,12,13};    //size is 3
        arr2 = Arrays.copyOf(arr1,arr1.length)   // size is 5   [1,3,5,7,9]
        arr2 will remove the elements 11 12 13
        arr2 will have only the elements of arr2 
        here the size can be modified
    7) Arrays.copyOfRange(arr1,3,5)       //copy the elemnts from index 3 to 5-1
    
