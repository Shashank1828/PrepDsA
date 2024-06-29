package array;

public class q1295 {
    public static void main(String[] args) {
        int[] matrix = {12, 345, 2, 6, 7896};
        int ans = countEven(matrix);
        System.out.println(ans); // Output should be 2
    }

    public static int countEven(int[] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            int num = matrix[i];
            int digitCount = 0;
            while (num != 0) {
                num /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
