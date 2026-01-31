
import java.util.Scanner;

class HashArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array (less than 13) : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // array input
        System.out.print("Enter the array numbers from 1 to 12 : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        // display the array
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

        
        // Build a frequency array: use each value in the main array as an index and increment the count at that index in the hash array
        // Count how many times each element appears in the array
        int[] hash = new int[13];

        for(int i = 0 ; i < n ; i++){
            hash[arr[i]] += 1;
        }

        // take the element you want to search 
        System.out.print("\nEnter the number you want to find its frequency : ");
        int number = input.nextInt();
        //fetch using hash[number] i.e, if the number is 7 itll search hash[7] and give the frequency
        System.out.println("the number " + number + " appears " + hash[number] + " Times");
    }
}