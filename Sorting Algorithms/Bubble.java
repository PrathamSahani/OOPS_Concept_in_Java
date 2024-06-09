

public class Bubble{
    public static void bubble_sort(int[] arr, int n){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
           int arr[] = {13, 46, 43, 56, 20, 20, 30, 18, 15};
           int n = arr.length;
           bubble_sort(arr, n);
    }
}