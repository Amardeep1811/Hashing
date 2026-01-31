
import java.util.Scanner;

class HashArrayOfString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String n = input.nextLine();

        
        // Build a frequency array: use each value in the main array as an index and increment the count at that index in the hash array
        // Count how many times each element appears in the array
        int[] hash = new int[26];

        for(int i = 0 ; i < n.length() ; i++){
            hash[n.charAt(i) - 'a']++;
        }

        // take the element you want to search 
        System.out.print("\nEnter the character you want to find its frequency : ");
        char character = input.next().charAt(0);


        //fetch using hash[number] i.e, if the char is a itll search hash[a - a] ie, hash[0] and give its frequency

        
        // System.out.println("the number " + character + " appears " + hash[character-'a'] + " Times");


        //can search multiple characters at the same time
        System.out.print("\nEnter characters to search: ");
        String query = input.next();
        
        for (int i = 0; i < query.length(); i++) {
            char ch = query.charAt(i);
            System.out.println("The character '" + ch + "' appears " +hash[ch - 'a'] + " times");
        }

    }
}