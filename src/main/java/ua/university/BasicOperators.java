package ua.university;


import java.util.Arrays;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        double[] result = new double[2];

        result[0] = a + b + c;
        result[1] = result[0] / 3;

        return result;
    }

    /**
     * Returns the maximum of three integers.
     */
    public static int maxOfThree(int a, int b, int c) {
        if( a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    /**
     /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if(score < 0 || score > 100)
            throw new IllegalArgumentException();

        if(score < 50)
            return 'F';
        else if (score < 60)
            return 'E';
        else if (score < 70)
            return 'D';
        else if(score < 80)
            return 'C';
        else if(score < 90)
            return 'B';
        else
            return 'A';
    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        if(day > 0 && day <= 7) {
            switch (day) {
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                case 7:
                    return "Sunday";
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if(n < 0)
            throw new IllegalArgumentException();

        int[] counting = new int[n];

        for(int i = n, j = 0; i > 0; i--, j ++)
            counting[j] = i;

        return counting;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if(n < 0)
            throw new IllegalArgumentException();

        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException();

        int[] reverse = new int[arr.length];

        for(int i = arr.length-1, j = 0; i >=0; i--, j++)
            reverse[j] = arr[i];

        return reverse;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            throw new IllegalArgumentException();

        int sum = 0;

        for(int i = 0; i < matrix[0].length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                sum += matrix[i][j];

        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty())
            throw new IllegalArgumentException();

        StringBuilder reverse_s = new StringBuilder();
        int n = s.length() - 1;
        for(int i = n; i >= 0; i--)
            reverse_s.append(s.charAt(i));

        if(s.equals(reverse_s.toString()))
            return true;
        else
            return false;
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {
        if(arr.length == 0)
            throw new IllegalArgumentException();

        int[] min_and_max = new int[2];
        int min, max;
        min = max = 0;

        for(int num: arr){
            if(num > max)
                max = num;
            else if(num < min)
                min = num;
        }
        min_and_max[0] = min;
        min_and_max[1] = max;

        return min_and_max;
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if (n == 0)
            throw new IllegalArgumentException();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = (i + 1) * (j + 1);

        return matrix;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {
        if (n < 0)
            throw new IllegalArgumentException();


        int[] even_numbers = new int[n / 2];
        int j = 0;

        for(int i = 2; i <= n; i+=2)
            even_numbers[j++] = i;

        return even_numbers;
    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {
        if(n == 2 || (n % 2 != 0 && n % 3 != 0))
            return true;
        return false;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if(n < 0)
            throw new IllegalArgumentException();
        if (n == 0)
            return new int[0]; // пустой массив
        if (n == 1)
            return new int[] {1};

        int[] numbers = new int[n];
        numbers[0] = 0; numbers[1] = 1;

        for(int i = 2; i < n; i++)
            numbers[i] = numbers[i-1] + numbers[i-2];

        return numbers;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null)
            throw new IllegalArgumentException();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];

        return transposed;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        boolean swapped;
        int start, end;
        int tmp;
        int[] sort_array = new int[arr.length];
        System.arraycopy(arr, 0, sort_array, 0, arr.length);

        swapped = true; start = 0;end = arr.length - 1;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (sort_array[i] > sort_array[i + 1]) {
                    tmp = sort_array[i];
                    sort_array[i] = sort_array[i + 1];
                    sort_array[i + 1] = tmp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;

            end--;
            swapped = false;
            for (int i = end; i > start; i--) {
                if (sort_array[i] < sort_array[i - 1]) {
                    tmp = sort_array[i];
                    sort_array[i] = sort_array[i - 1];
                    sort_array[i - 1] = tmp;

                    swapped = true;
                }
            }

            start++;
        }

        return sort_array;
    }

}