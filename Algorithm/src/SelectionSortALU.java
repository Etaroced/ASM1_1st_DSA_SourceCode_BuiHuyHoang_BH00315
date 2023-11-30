public class SelectionSortALU {
    public static void selectionSort(int[] arr){
        int count = arr.length;
        for (int i = 0; i < count; i++){
            // Thuật toán này mấu chốt cần tìm được min hoặc max
            int minIdx = i;
            for (int j = i+1; j < count; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                    // Tìm được vị trí của phần tử nhỏ nhất (tìm được phần tử nhỏ nhất)
                }
            }
            // Hoán đổi vị trí giữa các cấp số
            // Đưa phần tử nhở nhất về đầu mảng
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printResult(int[] arr){
        System.out.println();
        System.out.println("Mảng sau khi được sắp xếp theo thuật toán Selection Sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
