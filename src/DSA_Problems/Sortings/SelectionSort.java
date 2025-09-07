package DSA_Problems.Sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,4,10,8,3,1};
        selectionSort(arr);
        Utility.printArray(arr);
    }

    public static void selectionSort(int[] arr){
        int min;
        for(int i = 0; i<arr.length-1;i++){
            min = i;
            for(int j = i+1;j<arr.length;j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
