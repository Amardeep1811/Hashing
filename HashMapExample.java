import java.util.HashMap;
import java.util.Scanner;

class HashMapExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> hash = new HashMap<>();

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

        //for iteration in the hashmap

        // for(HashMap.Entry<Integer , Integer> entry : hash.entrySet()){
        //     System.out.println(entry.getKey() + "->" + entry.getValue());
        // }

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