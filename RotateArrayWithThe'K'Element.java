import java.util.*;

public class RotateArray{

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size=input.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("enter the k element:");
        int k=input.nextInt();
        
        input.close();
        rotateArray(arr,k);

        System.out.println("rotated array:");
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    public static void rotateArray(int[] arr,int k){
        int n=arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
}
