# Java Program to Sort an Array by Finding Maximum Values

## Description
This Java program sorts an array of integers by repeatedly finding the maximum value and swapping it with the last unsorted element. The program prints the maximum value found in each iteration and the length of the unsorted portion of the array. Finally, it prints the sorted array.

## How It Works
1. The program initializes an array of integers.
2. It iterates through the array to find the maximum value in the unsorted portion.
3. The maximum value is swapped with the last unsorted element.
4. The length of the unsorted portion is reduced by one.
5. Steps 2-4 are repeated until the entire array is sorted.
6. The sorted array is printed.

## Code
```java
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {15,12,50,4,17,1,57,49,3,1001,63,100,1000,10};
        int temp;
        int max = 0;
        int indexOfMax = 0;
        int length = numbers.length;
        for (int i = 0; i< numbers.length; i++){
            for (int x = 0; x < length; x++){
                if (max < numbers[x]){
                    max = numbers[x];
                    indexOfMax = x;
                }
            }
            max = 0;
            System.out.println("Max value is: " + numbers[indexOfMax]);
            temp = numbers[length-1];
            numbers[length-1] = numbers[indexOfMax];
            numbers[indexOfMax] = temp;
            length--;
            System.out.println("length is: " + length);
        }
        for (int iterator: numbers){
            System.out.println(iterator);
        }
    }
}
```
## How to Run
1. Copy the code into a file named Main.java.
2. Compile the code using the command: javac Main.java.
3. Run the compiled code using the command: java Main.
