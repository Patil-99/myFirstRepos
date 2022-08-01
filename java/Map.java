import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        Integer count;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        System.out.println("Enter the string :");
        str=sc.nextLine();

        for(int i=0;i<str.length();i++)
        {
            count=1;
            if (map.containsKey(str.charAt(i)))
            {
                count++;
                map.put(str.charAt(i),count);
            }
            else
            {
                map.put(str.charAt(i),count);
            }

        }
        System.out.println(map);
    }
}