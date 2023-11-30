public class InsertionSortALU {
    public static void  insertionSort(int[] arrNumber){
        int count = arrNumber.length;
        for (int i = 1; i < count; i++){
            // Các phần tử được duyệt
            int key = arrNumber[i];
            // Vì i = 1: bắt đầu từ phần tử sau phần tử đầu tiên
            // j: vị trí các phần tử đứng trước các phần tử đang được duyệt
            int j = i - 1;
            while (j >= 0 && arrNumber[j] > key){
                // Nếu như phần tử đứng đằng trước các phần tử đang được duyệt mà lớn hơn thì thực hiện hoán đổi vị trí
                arrNumber[j+1] = arrNumber[j];
                j--;
            }
            // Tiếp tục đổi vì đang duyệt thành vị trí đứng sau để tiếp tục thực thi kiểm tra
            arrNumber[j+1] = key;
        }
    }
    public static void printResult(int[] arr){
        System.out.println();
        System.out.println("Mảng sau khi được sắp xếp theo thuật toán Insertion Sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
