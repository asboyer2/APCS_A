package Arrays;

public class arrhw {
    public static void main(String[] args) {
        int[][] arr = { {3,2,1},{1,2,3}};
        for (int row = 1; row < arr.length; row++) {
            for (int col = 1; col < arr[0].length; col++) {
                if (arr[row][col] % 2 == 1)
                {
                    arr[row][col] = arr[row][col] + 1;
                }
                if (arr[row][col] % 2 == 0)
                {
                    arr[row][col] = arr[row][col] * 2;
                }
            }
        }
        ArrayUtil.printArray(arr[0]);
        ArrayUtil.printArray(arr[1]);
    }
}
