import java.util.Scanner;

public class Zad1f {
    public static String Change(String str)
    {
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                buffer.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                buffer.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        String ZmiennaSwitchType = buffer.toString();
        return ZmiennaSwitchType;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo ktore chcesz powiekszyc");
        String str = scanner.nextLine();
        System.out.println(Change(str));
    }

}
