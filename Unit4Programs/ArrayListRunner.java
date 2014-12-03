import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       String[] start = {"Alice", "Bob", "Connie", "David"," Edward", "Fran", "Gomez", "Harry"};
       ArrayList names = new ArrayList();
       System.out.println(start[4]);
       for(int i = 0;i<= start.length; i++)
       {
           names.add(start[i]);
       }
       for(int i = 0; i< names.size(); i++){
           System.out.println(names(i));
        }
   }
}