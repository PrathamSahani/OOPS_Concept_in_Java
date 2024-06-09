
public class Insertion{
    public static void insertion_sort(int[] arr, int n){
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {23, 43, 21, 20, 56, 45, 2};
        int n = arr.length;
        insertion_sort(arr, n);
    }
}