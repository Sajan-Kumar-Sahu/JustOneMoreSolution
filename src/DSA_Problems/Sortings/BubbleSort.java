package DSA_Problems.Sortings;

public class BubbleSort {
    public static void main(String[]args){
        int[] arr = {15,16,6,8,5};
        bubbleSort(arr);
        Utility.printArray(arr);
    }
    public static void bubbleSort(int[] arr){
        boolean flag;
        for(int i=0;i<arr.length-1;i++){
            flag = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
