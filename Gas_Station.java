public class Gas_Station {
    public static void main(String[] args) {
        int gas[] = {2,3,4};  //SAMPLE TEST CASE
        int cost[] = {3,4,3};
        int start = 0;
        int flag = 0;
        int n = gas.length;
        int gassum =0;
        int costsum = 0;
//
        for(int i =0;i<n;i++)
        {
            gassum += gas[i];
            costsum += cost[i];

        }
        int avail =0;

        if(gassum >= costsum)
        {
            flag =1;
            for(int i =0;i<n;i++)
            {
                avail += gas[i]-cost[i];
                if(avail<0)
                {
                    avail =0;
                    start = i+1;

                }
            }
        }
        else
            System.out.println(-1);


        if(flag == 1)
            System.out.println(start);
    }

    //  Brute Force solution

    public static void BruteForceSolution()
    {
        int gas[] = {2,3,4};  //SAMPLE TEST CASE
        int cost[] = {3,4,3};
        int n = gas.length;
        int start = 0;
        int flag = 0;
        for (int z = 0; z < n; z++) {
            if (gas[z] >= cost[z]) {
                start = z;


                int curr = gas[start];
                int i = start;
                while (true) {
                    //  System.out.println((i+1)%3);

                    curr += gas[(i + 1) % n] - cost[i];
                    i = (i + 1) % n;

                    if (curr < cost[i])
                        break;

                    if (i == start) {
                        System.out.println(start);
                        flag = 1;
                        break;
                    }

                }
            }
            if (flag == 0) {
                System.out.println(-1);
            }

        }
    }
}
