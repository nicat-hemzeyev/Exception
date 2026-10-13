import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Throwable {

//task 1
        Scanner sc = new Scanner(System.in);
        int count = 0;
        do {
            count = 0;
            try {
                System.out.println("birinci ededi daxil edin: ");
                double a = sc.nextDouble();
                System.out.println("ikinci ededi daxil edin: ");
                double b = sc.nextDouble();
                double c = a / b;
                System.out.println(c);
            } catch (InputMismatchException e) {
                System.out.println("xahis olunur eded daxil edin");
                sc.nextLine();
                count++;
            } catch (ArithmeticException e) {

            } finally {
                System.out.println("hesab bitdi");
            }
        } while (count != 0);

//task 2
        String[] names = {"Ali", "Vüsal", "Aysel"};
        Scanner sc1 = new Scanner(System.in);
        try {
            System.out.println(Arrays.toString(names) + " adinizin index-ni daxil edin: ");
            int i = sc1.nextInt();
            System.out.println(names[i]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("yalnis index-i daxil etmisiz");
        }

//task 3
        String[] arr1 = {"12", "abc", "7", "", "3.5", "-4"};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            try {
                sum += Integer.parseInt(arr1[i]);
            } catch (Exception e) {
                System.out.println(arr1[i] + " reqem deyil");
            }
        }
        System.out.println("umumi int cemi: " + sum);

//task4
        registerUser("nicat", 23);
        registerUser("nicat", 123);

//task 5
        System.out.println(parseIntOrDefault("2a3", 0));
        System.out.println(parseDoubleOrDefault("12.5", 0.0));

    }


    public static void registerUser(String name, int age) throws InvalidAgeException {
        if (age < 18 || age > 120) {
            throw new InvalidAgeException("Age can not be invalid");
        }

    }

    public static int parseIntOrDefault(String s, int def) {
        try {
            def = Integer.parseInt(s);
        } catch (Exception e) {
            return def;
        }
        return def;
    }

    static double parseDoubleOrDefault(String s, double def) {
        try {
            def = Double.parseDouble(s);
        } catch (Exception e) {
            return def;
        }
        return def;
    }
}