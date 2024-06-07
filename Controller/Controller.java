package HomeWork_7.Controller;

import HomeWork_7.Model.DivisionModel;
import HomeWork_7.Model.Model;
import HomeWork_7.Model.MultiplyModel;
import HomeWork_7.Model.SumModel;
import HomeWork_7.View.View;

import java.util.Scanner;

public class Controller {
    public View view;
    private Model model;

    public Controller(View view) {
        this.view = view;;
    }

    public void buttonClick() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте 1-е вещественное число");
        double a = view.getValue("a: ");
        System.out.println("Задайте 2-е вещественное число");
        double b = view.getValue("b: ");
        System.out.printf("Вы задали два числа: a = %f и b = %f\n", a, b);
        while (true) {
            System.out.printf("\nВыберите арифметическую операцию для чисел %f и %f: \n", a, b);
            System.out.println("1 - '+' ");
            System.out.println("2 - '*' ");
            System.out.println("3 - '/' ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.printf("Выбранная операция: сложение\n");
                view.printResult(getResultOfOperation(new SumModel(), a, b), "Результат сложения: ");
                break;
            } else if (choice == 2) {
                System.out.printf("Выбранная операция: умножение\n");
                view.printResult(getResultOfOperation(new MultiplyModel(), a, b), "Результат умножения: ");
                break;
            } else if (choice == 3) {
                System.out.printf("Выбранная операция: деление\n");
                while (true) {
                    if (b == 0) {
                        System.out.println("На 0 делить нельзя\nЗадайте 2-е вещественное число");
                        b = view.getValue("b: ");
                        System.out.printf("Вы задали два числа: a: %f и b: %f\nВыбранная операция: деление\n", a, b);
                    } else {
                        break;
                    }
                }
                view.printResult(getResultOfOperation(new DivisionModel(), a, b), "Результат деления: ");
                break;
            } else {
                System.out.println("Такой операции в списке нет, повторите ввод операции");
            }
        }
    }

    private double getResultOfOperation(Model choiceModel, double a, double b){
        model = choiceModel;
        model.setX(a);
        model.setY(b);
        return model.result();
    }
}
