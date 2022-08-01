import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicateChar {

    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        str=sc.nextLine();
        Set s=new HashSet();
        for(int i=0;i<str.length();i++)
        {
            s.add(str.charAt(i));
        }
        ArrayList<String> a=new ArrayList<>(s);

        int j=0;
        String k="";
        while (  j<=a.size()-1){
             k+=a.get(j);
             j++;
}       System.out.println(k);}}