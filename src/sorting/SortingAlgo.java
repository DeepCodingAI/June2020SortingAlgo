package sorting;

public class SortingAlgo {

    public int[] insertionSort(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

        }
        return array;
    }

    public int[] selectionSort(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j]<array[index])
                    index = j;
            int smallestSoFar = array[index];
            array[index] = array[i];
            array[i] = smallestSoFar;

        }
        return array;
    }
}
