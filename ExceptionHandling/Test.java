package ExceptionHandling;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws NumberFormatException {
        try {
            int i=Integer.parseInt(args[0]);
            System.out.println(i);
        } 
        catch(RuntimeException rn)
        {
            System.out.println(rn);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
