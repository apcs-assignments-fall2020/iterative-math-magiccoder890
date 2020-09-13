import java.util.Scanner;
public class MyMain {
    public static double babylonian(double x) {
        double m = 0;
        double n = 1;
        while (m - n > 0.00001 || m - n < -0.00001) {
            m = (n + (x / n)) / 2 ;
            n = m;
            m = (n + (x / n)) / 2 ;
        }
        System.out.print(n);
        return n;
    }
    public static double factorial(int test_int) {
        double answer = 1;
        if (test_int == 0) {
            System.out.print("The factorial of 0 is 1");
        }
        else {
            while (test_int > 1) {
                answer = (int) (answer * test_int);
                test_int--;
            }
        }
        //System.out.print("\n" +answer);
        return answer;
    }
    public static double calculateE() {
        int start_num = 1;
        double e_value = 1;
        while (true){
            e_value += 1/factorial(start_num);
            if (Math.E - e_value < 0.0000001) {
                break;
            }
            else {
                start_num ++;
            }
        }
        System.out.print( e_value);
        return e_value;
    }
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input what number that you want to test");
        double test = scanner.nextDouble();
        babylonian(test);
        System.out.print("Please take an integar as input");
        int test_int = scanner.nextInt();
        factorial(test_int);
        calculateE();
    }
}
