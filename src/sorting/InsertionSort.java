package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {10, 8, 5, 1, 3 , 6};
        int temp = 0;
        for(int i = 1; i<array.length; i++){
            for(int j=i; j>0; j--){
                if(array[j]<array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        //Retrieving data from sorted array
        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }
}
