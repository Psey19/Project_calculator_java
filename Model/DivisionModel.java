package HomeWork_7.Model;


import java.util.Scanner;

public class DivisionModel extends CalcModel {

    public DivisionModel() {
    }

    @Override
    public double result() {
        return x / y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        if (value == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("На ноль делить нельзя. Введите другое число");
            System.out.print("b: ");
            value = scanner.nextDouble();
            super.y = value;
        } else
            super.y = value;
    }
}
