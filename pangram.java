import java.util.*;
class A
{
    boolean display(String s1)
    {  
        s1=s1.toLowerCase().replaceAll("\\s","");
        boolean occur[]=new boolean[26];
        for(int i=0;i<s1.length();i++)
        {
            occur[s1.charAt(i)-'a']=true;
        }
        for(int j=0;j<occur.length;j++)
        {
            if(occur[j]==false)
            {
                return false;
            }
        }
        return true;
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        A obj1=new A();
        if( obj1.display(s1))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}