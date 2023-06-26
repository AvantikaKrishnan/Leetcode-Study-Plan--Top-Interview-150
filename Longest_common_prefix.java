import java.util.*;
public class Longest_common_prefix {
    public static void main(String[] args) {
        String strs[] = {"dog","racecar","car"}; //test case
        Arrays.sort(strs); // We sort the array so as to make sure that if any word exists without the common prefix then it gets sorted to either the start or end
        int i =0;
        int l = 0;
        int n = strs.length;
            String s = strs[i];
            String la = strs[n-1];
            while(l<s.length() && l<la.length() && s.charAt(l) == la.charAt(l))
                    l++;

        if(l==0)
            System.out.println("NO"); //return ""

        else
            System.out.println(s.substring(i,l)); //return longest common prefix



    }
}
