import javax.naming.PartialResultException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     /* Các thuật toán sắp xếp */
     /* 1 - Bubble sort */
     int[] randomNumbers = {100, 3, 1, 20, 5, 4};
     BubbleSortALU.bubbleSort(randomNumbers, randomNumbers.length);
     BubbleSortALU.printResult(randomNumbers);
     /* 2 - Insertion Sort */
     InsertionSortALU.insertionSort(randomNumbers);
     InsertionSortALU.printResult(randomNumbers);
     /* 3 - Selection Sort */
     SelectionSortALU.selectionSort(randomNumbers);
     SelectionSortALU.printResult(randomNumbers);
     /* 4 - Merge Sort */
     MergeSortALU.sortResult(randomNumbers, 0, randomNumbers.length - 1);
     MergeSortALU.printResult(randomNumbers);
    }
}