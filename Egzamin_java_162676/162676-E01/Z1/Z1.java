import java.time.LocalTime;
import java.util.*;
public class Z1 {
  public static <T> ArrayList<T>removeRepeatedElements(T[]array){
    Set<T> resultSet = new HashSet<>(Arrays.asList(array));
    return new ArrayList<>(resultSet);
  }

  public static void main(String[] args) {
     Character a = 'a';
     Character b = 'b';
     Character c = 'c';
     Character c2 = 'c';
     Character d = 'd';

     Character chars[] = {a,b,c,c2,d};

     System.out.println(removeRepeatedElements(chars));
       LocalTime lt = LocalTime.MIDNIGHT;
       LocalTime lt2 = LocalTime.NOON;
       LocalTime lt3 = LocalTime.now();
       LocalTime lt4 = LocalTime.NOON;
       LocalTime times[] = {lt,lt2,lt3,lt4};

       System.out.println(removeRepeatedElements(times));


  }
}
