import java.util.Scanner;
import java.lang.Thread;
public class bubble_sort extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");
        int lmt = sc.nextInt();

        int arr[] = new int[lmt];
        System.out.println("Enter elements...");
        /* inserting the value to the array */
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("--YOUR ELEMENTS--");
        try{
            for(int i: arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        /* Logic of Bubble Sort */
        int temp = 0;
        for(int i = 0; i < lmt; i++){
            for(int j = 0; j < lmt-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("--SORTED ELEMENTS--");
        try{
            for(int i: arr){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}