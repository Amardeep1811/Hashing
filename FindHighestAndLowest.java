import java.util.HashMap;
import java.util.Scanner;
class FindHighestAndLowest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer , Integer> hash = new HashMap<>();

        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i ++){
            arr[i] = input.nextInt();
            hash.put(arr[i] , hash.getOrDefault(arr[i], 0) + 1);
        }

        int maxElement = 0 , maxFrequency = 0;
        int lowElement = 0 , lowFrequency = n;

        for(HashMap.Entry<Integer , Integer> entry : hash.entrySet() ){
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFrequency){
                maxFrequency = count;
                maxElement = element;
            }

            if (count < lowFrequency){
                lowFrequency = count;
                lowElement = element;
            }

        }
        System.out.println("The highest frequency element is : " + maxElement);
        System.out.println("The lowest Frequency element is : " + lowElement);
        

    }
}