package sorting;

public class TestAlgo {
    public static void main(String[] args) {
        int [] array1 = {10, 8, 5, 1, 3 , 6};
        SortingAlgo sorting = new SortingAlgo();
        int [] sortedInsertionArray = sorting.insertionSort(array1);
        int [] array2 = {13, 2, 50, 10, 4 , 9};
        int [] sortedSelectionArray = sorting.selectionSort(array2);

        System.out.println("Applying Insertion Sort");
        for (int n=0; n<sortedInsertionArray.length; n++){
            System.out.println(sortedInsertionArray[n]);
        }

        System.out.println("Applying Selection Sort");
        for (int n=0; n<sortedSelectionArray.length; n++){
            System.out.println(sortedSelectionArray[n]);
        }
    }
}
