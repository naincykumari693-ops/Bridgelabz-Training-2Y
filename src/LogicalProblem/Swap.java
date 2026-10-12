package LogicalProblem;


import java.util.Scanner;

public class Swap {
    public static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;

    }
    public static void dispaly(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr [] = new int[size];
        System.out.println("Enter the elements of array");
        for(int i = 0 ;i<arr.length ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("");

    }
}
