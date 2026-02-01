import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class TreeMapExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Integer, Integer> hash = new TreeMap<>();

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            // hash.put(arr[i] , hash.getOrDefault(arr[i], 0) + 1 );
        }

        for(int i = 0 ; i < n ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i], 0) + 1 );
        }

        //for iteration in the Treemap

        for(Map.Entry<Integer , Integer> entry : hash.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.print("Enter how many numbers you want to find : ");
        int q = input.nextInt();

        while(q  < n){
            System.out.print("Enter the number you want to find : ");
            int number = input.nextInt();
            System.out.print("The number appears : " + hash.getOrDefault(number , 0) + " times\n");
            q++;
        }
    }
}


// hash.get(number) if the number appears 0 times itll show null 
// hash.getOrDefault(number , 0) use this to avoid that