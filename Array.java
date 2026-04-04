public class Array {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("After reverse array:");

        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.println(arr[j]);
        }
    }
}