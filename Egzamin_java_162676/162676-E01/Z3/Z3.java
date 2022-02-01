import java.io.File;
import java.util.Arrays;
public class Z3 {
    public static void main(String[] args) {
        File current = new File(".");
        File[] files = current.listFiles();
        Arrays.sort(files, (a,b) -> {
            if(a.equals(b))return 0;
            if(a.isDirectory()&&b.isFile()) return -1;
            if(a.isFile()&&b.isDirectory()) return 1;
            return a.getName().compareTo(b.getName()); });
        for(File f: files)
        {
            System.out.println(f.getName());
        }
    }
}
