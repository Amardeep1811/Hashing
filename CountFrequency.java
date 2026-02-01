import java.util.HashMap;
import java.util.Scanner;
class CountFrequency{
    public static void main(String[] args){
        HashMap<Integer , Integer> hash = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
            hash.put(arr[i] , hash.getOrDefault(arr[i], 0) + 1);
        }

        for(HashMap.Entry<Integer , Integer> entry : hash.entrySet()){
            System.out.println("The number " + entry.getKey() +" appeared" + entry.getValue()+ " Times");
        }

    }
}