import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] arrOfStr = str.split(" ");
        Stack s= new Stack();
        for(int i=0;i< arrOfStr.length;i++)
        {
            s.add(arrOfStr[i]);
        }
        String newstr="";
        for (int j=0;j< arrOfStr.length;j++){
            newstr+=s.pop()+" ";
            }
        System.out.println(newstr);

    }
}