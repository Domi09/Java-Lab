import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string yo be checked->>\n");
        String str=sc.next();
        str =str.toLowerCase();
        sc.close();
        char[] ch = str.toCharArray();
    int j=str.length()-1;
        for (int i = 0;i<j;i++,j--){
            if(ch[i]!=ch[j]){
System.out.println(str +"Not a palindrome\n");
return ;
            }


         

        }
        System.out.println(str+" Is a palindrome! ");
    }
    
}
