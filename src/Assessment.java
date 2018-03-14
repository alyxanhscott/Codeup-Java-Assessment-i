import java.util.List;


public class Assessment {


    public static int square(int num) {
        return num * num;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return ((double) sum) / array.length;
    }

    public static void capitalizeRecords(List<User> u) {
//
    }


    public static void main(String[] args) {
//        testing methods here
        int[] x = {2, 2, 2, 2};
        System.out.println(square(8));
        System.out.println(sum(3.5, 4));
        System.out.println(sum(2, 4));
        System.out.println(average(x));

    }

}




