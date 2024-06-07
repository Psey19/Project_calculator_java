package HomeWork_7.View;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public double getValue(String nameValue){
        System.out.printf("%s", nameValue);
        return scanner.nextDouble();
    }

    public void printResult(double result, String title){
        System.out.printf("%s %f\n", title, result);
    }
}
