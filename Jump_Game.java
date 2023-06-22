public class Jump_Game {
    static boolean b = false;

    public static void main(String[] args) {
        int count = 0;
        int arr[] = {1,2,1,1,1};
        int last = arr.length - 1;
        int max = 0;
        for (int i = 0; i <= max; i++) {
            max = Math.max(max, i + arr[i]);


            if (max >= last) {
                System.out.println(i+1);
                break;
            }

        }
       // System.out.println("false");

    }
}

