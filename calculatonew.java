public class calculatonew {
class ThirdDayProgramming {


//method 1   to demonstrate variable reassignment
public void sampleMethod() {
    System.out.println("This is a sample method. right now Mumbai !!");
}
//method 2 simple method with no return type
public void  sampleMethod2() {
    System.out.println("This is another sample method-2. Ciku");  
}
//method 3 parameterized method with int return type
public int sum(int x, int y) {
    int result = x + y;
    return result;
}
//method 4 String return type
public String sampleMethod3() {
    return "This method returns a string value.";
}
    public static void main(String[] args) {
        System.out.println("Hello from main ThirdDayProgramming class!-Soumya");
        ThirdDayProgramming objectName_kuch_v = new  ThirdDayProgramming();
        objectName_kuch_v.sampleMethod();
        objectName_kuch_v.sampleMethod2();
        int result = objectName_kuch_v.sum(10, 20);
        System.out.println("Sum result is:sum wale method sai  " + result);
        int sumResult = objectName_kuch_v.sum(15, 25);
        System.out.println("Sum result is: " + sumResult);
        String returnValue = objectName_kuch_v.sampleMethod3();
        System.out.println("Returned value: " + returnValue);
    }
}
}
