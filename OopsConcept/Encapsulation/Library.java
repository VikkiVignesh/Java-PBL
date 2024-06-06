package OopsConcept.Encapsulation;

public class Library
{
   public static void main(String[] args) {
     Book book1=new Book("Java", "Vikcy", "2110246@reva.ed.in", "Male");
     System.out.println("________Book Information_______");
     System.out.println("Book : "+book1.getBook());
     System.out.println("Author : "+book1.getAuthor());
     System.out.println("Email : "+book1.getmail());
     System.out.println("Gender : "+book1.getgender());
   }
   
}
/**
 * InnerLibrary
 */
class Author{
   private String name,email,gender;
    Author(String x,String y,String z)
    {
        name=x;
        email=y;
        gender=z;
    }
    void setname(String v)
    {
        name=v;
    }
    String getname()
    {
        return name;
    }
    
    void setmail(String v)
    {
        email=v;
    }
    String getmail()
    {
        return email;
    }

    void setgender(String v)
    {
        gender=v;
    }
    String getgender()
    {
        return gender;
    }
    
}
class Book  {
   private String name;
    private Author auth;
    Book(String name,String n,String y,String t)
    {
        this.name=name;
        this.auth=new Author(n,y,t);
    }
    void setBook(String str)
    {
        name=str;
    }
    String getBook()
    {
        return name;
    }

    void setAuthor(String s)
    {
        auth.setname(s);;
    }
     String getAuthor()
     {
        return auth.getname();
     }
     void setmail(String s)
     {
         auth.setmail(s);;
     }
      String getmail()
      {
         return auth.getmail();
      }

      void setGender(String s)
      {
          auth.setgender(s);;
      }
       String getgender()
       {
          return auth.getgender();
       }

       
}
