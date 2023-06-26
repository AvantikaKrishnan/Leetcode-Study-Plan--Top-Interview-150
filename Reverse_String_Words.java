public class Reverse_String_Words {
    public static void main(String[] args) {
       String s = "a good    example";

       s = s.trim();
       s = s.replaceAll("  +" ," ");
       String arr[] = s.split(" ");

       int low = 0;
       int high =  arr.length-1;
       while(low<=high)
       {
           String temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           low++;
           high--;
       }

       String newstr = String.join(" ", arr);
       System.out.println(newstr);




    }
}
