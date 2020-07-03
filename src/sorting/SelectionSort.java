package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {10, 8, 5, 1, 3 , 6};
        for(int i=0; i<array.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j]<array[index])
                    index = j;
                    int smallestSoFar = array[index];
                    array[index] = array[i];
                    array[i] = smallestSoFar;

        }
        //retrieving
        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }
}
