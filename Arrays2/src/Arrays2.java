import java.util.Arrays;
import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity");
        int a = Integer.parseInt(sc.nextLine());
        int[] array = new int[a];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter the num: ");
             array[i] = sc.nextInt();
        }
        insert(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insert(int[] array){
        int k;
        int p;
        for(int i = 0; i < array.length-1; i++){
            k=i;
            while(k >= 0 && array[k] > array[k+1]){
                p=array[k+1];
                array[k+1] = array[k];
                array[k] = p;
                k--;
            }
        }
    }
}


