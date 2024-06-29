package ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int x=56/0;
                System.out.println(x);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int arr[]=new int[2];
                System.out.println("Accessing Array Index");
                arr[2]=50;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
