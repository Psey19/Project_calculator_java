package HomeWork_7.View;


import java.util.Scanner;

public class ViewSumMultyDiv implements View {
    Scanner sc = new Scanner(System.in);
    private String choice;
    private String a;
    private String b;

    @Override
    public String getChoice() {
        return this.choice;
    }
    @Override
    public String getValue(String nameValue){
        System.out.printf("%s", nameValue);
        return sc.nextLine();
    }
    @Override
    public void printResult(double result){
        System.out.printf("Результат: %f\n", result);
    }
    @Override
    public String choiceOperation(){
        System.out.printf("\nВыберите арифметическую операцию: \n");
        System.out.println("1 - '+' ");
        System.out.println("2 - '*' ");
        System.out.println("3 - '/' ");
        return sc.nextLine();
    }
    @Override
    public void getOperationName(String choice){
        this.choice = choice;
        boolean isInteger = choice.matches("-?\\d+");
        if (!isInteger) {
            System.out.println("Вы ввели не число, повторите ввод операции");
            getOperationName(choiceOperation());
        }
        else if (Integer.parseInt(choice) == 1)
            System.out.println("Выбранная операция: сложение");
        else if (Integer.parseInt(choice) == 2)
            System.out.println("Выбранная операция: умножение");
        else if (Integer.parseInt(choice) == 3)
            System.out.println("Выбранная операция: деление");
        else {
            System.out.println("Такой операции в списке нет, повторите ввод операции");
            getOperationName(choiceOperation());
        }
    }

    @Override
    public Double enterFirstNumber() {
        System.out.println("Задайте 1-е вещественное число");
        String a = getValue("a: ");
        this.a = a;
        boolean isInteger = a.matches("[-+]?\\d*\\.?\\d+([eE][-+]?\\d+)?");
        if (!isInteger) {
            System.out.println("Вы ввели не вещественное число, повторите ввод операции");
            enterFirstNumber();
        }
        return Double.parseDouble(this.a);
    }

    @Override
    public Double enterSecondNumber() {
        System.out.println("Задайте 2-е вещественное число");
        String b = getValue("b: ");
        this.b = b;
        boolean isInteger = b.matches("[-+]?\\d*\\.?\\d+([eE][-+]?\\d+)?");
        if (!isInteger) {
            System.out.println("Вы ввели не вещественное число, повторите ввод операции");
            enterSecondNumber();
        }
        return Double.parseDouble(this.b);
    }
}
