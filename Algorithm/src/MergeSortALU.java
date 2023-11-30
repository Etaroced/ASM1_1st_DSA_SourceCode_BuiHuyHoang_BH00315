public class MergeSortALU {
    private static void mergeSortALU(int[] arr, int l, int m, int r) {
        // Cần tìm kích thước của 2 mảng con ban đầu được tách
        int n1 = m - l + 1;
        int n2 = r - m;
        // Mảng con thứ nhất: arr[l...m]
        // Mảng con thứ hai: arr[m+1...r]
        // Tạo các mảng con bên trái và bên phải
        // Khai báo mảng rỗng với kích thước định sẵn
        int[] Left = new int[n1];
        int[] Right = new int[n2];
        // Copy dữ liệu vào 2 mảng trái - phải vừa tạo
        for (int i = 0; i < n1; i++) {
            Left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            Right[j] = arr[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    public static void sortResult(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; // Vị trị tách mảng
            // Đệ quy lại - gọi chính hàm đó trong hàm
            MergeSortALU.sortResult(arr, l, m);
            MergeSortALU.sortResult(arr, m + 1, r);
            // Gọi hàm merge đã viết
            MergeSortALU.mergeSortALU(arr, l, m, r);
        }
    }

    public static void printResult(int[] arr) {
        System.out.println();
        System.out.println("Mảng sau khi được sắp xếp theo thuật toán Merge Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
