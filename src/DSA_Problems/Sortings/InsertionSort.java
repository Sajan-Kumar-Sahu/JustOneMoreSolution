package DSA_Problems.Sortings;

public class InsertionSort {
    public static void main(String[]args){
        int[] arr = {5,4,10,1,6,2};
        insertionSort(arr);
        Utility.printArray(arr);
    }

    public static void insertionSort(int[] arr){
        int temp;
        int j;
        for(int i=1;i<arr.length;i++){
            temp = arr[i];
            j = i-1;
                while(j>=0 && arr[j]>temp){
                    arr[j+1] = arr[j];
                    j--;
                }
            arr[j+1] = temp;
        }
    }
}
