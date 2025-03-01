import java.util.*;

public class String {
    public static void main(String[] args) {
        String str = "123+456";
        
        String[] parts = str.split("\\+"); 
        
        int sum = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);

        System.out.println(sum); 
    }
}
