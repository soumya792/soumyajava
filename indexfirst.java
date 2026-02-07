public class indexfirst {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
         int newArr[] = new int [6];
       newArr[0]=30;
        for (int i = 0; i < 5; i++) {
            newArr[i+1] = arr[i];
        }
        for(int i = 0; i < 6; i++){
            System.out.println(newArr[i] + "");
        } 
        }
    }



