import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int count = 0;
        int[][] arr = new int[6][6];

        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[0][3] = 0;
        arr[0][4] = 0;
        arr[0][5] = 0;

        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[1][3] = 0;
        arr[1][4] = 0;
        arr[1][5] = 0;

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 0;
        arr[2][4] = 0;
        arr[2][5] = 0;

        arr[3][0] = 0;
        arr[3][1] = 0;
        arr[3][2] = 2;
        arr[3][3] = 4;
        arr[3][4] = 4;
        arr[3][5] = 0;

        arr[4][0] = 0;
        arr[4][1] = 0;
        arr[4][2] = 0;
        arr[4][3] = 2;
        arr[4][4] = 0;
        arr[4][5] = 0;

        arr[5][0] = 0;
        arr[5][1] = 0;
        arr[5][2] = 1;
        arr[5][3] = 2;
        arr[5][4] = 4;
        arr[5][5] = 0;

        int sum[] = new int[16];
        int countSum = 0;

        for (int z = 0; z < 4; z++) {
            for (int w = 0; w < 4; w++) {
                for (int i = 0 + z; i < z + 3; i++) {
                    for (int j = w; j < 3 +w ; j++) {

                        if (count !=3) {
                            if (count !=5) {
                                sum[countSum] += arr[i][j];
                            }
                        }count++;
                    }
                }
                count = 0;
                countSum++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[sum.length-1]);
    }
}

