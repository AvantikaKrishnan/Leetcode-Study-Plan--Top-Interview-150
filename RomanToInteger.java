import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String s = "III";
        int num = 0;
        int l = s.length();
        for(int i =l-1;i>=0;i--)
        {
            int a = map.get(s.charAt(i));
            if(4*a<num)
            {
                num -= a;
            }
            else {
                num += a;
            }
        }
        System.out.println(num);
    }
}
