package ExceptionHandling;

public class UserValidate {
    public static void main(String[] args) throws Throwable {
        try {
            System.out.println("Enter the name of person and Their age by leaving space between each other");
            System.out.println("Person Name :"+args[0]);
            System.out.println("Age : "+Integer.parseInt(args[1]));
            
            if(Integer.parseInt(args[1])<18)
            {
                throw new Throwable("Child ....");
            }
                else if (Integer.parseInt(args[1])>= 18 && Integer.parseInt(args[1]) <= 60) {
                    System.out.println("Not a Senior Citizen...");
                } else {
                    throw new Throwable("Senior Citizen....");
                }
            
            } catch (NumberFormatException e) {
                System.out.println("Invalid age format: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (Throwable e) {
                System.out.println(e.getMessage());
            } 
            finally {
                System.out.println("Validation process completed.");
            }
    }
}
