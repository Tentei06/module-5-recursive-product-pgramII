/*

* Program Name: RecursiveProduct.java
* Author: Cody Walker
* Date: 5/14/2026

* Pseudocode:

* Create scanner object.
* Create array to store 5 numbers.
* Ask user to enter 5 numbers.
* Store numbers into array.
* Call recursive product method.
* Multiply numbers recursively.
* Display final product.

* Program Inputs:
* User enters 5 numbers

* Program Outputs:
* Product of the 5 numbers

*/

import java.util.Scanner;

public class RecursiveProduct
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Array stores 5 user numbers
        int[] numbers = new int[5];

        // Loop collects user input
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int product = recursiveProduct(numbers, 0);

        System.out.println("\nFinal product: " + product);

        input.close();

    }

    public static int recursiveProduct(int[] numbers, int index)
    {

        // Base case stops recursion
        if(index == numbers.length - 1)
        { 
            return numbers[index];
        }

        // Recursive case multiplies numbers 
        return numbers[index] * recursiveProduct(numbers, index + 1);
    }

    // IMPROVEMENT: added iterative version to compare recursion with a loop
    public static int iterativeProduct(int[] numbers)
    {
        int product = 1;
        for (int i = 0; i < numbers.length; i++)
        {
            product = product * numbers [i];
        }
        
        return product;
    }

}
