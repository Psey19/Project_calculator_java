package HomeWork_7.View;

import HomeWork_7.Log.Log;
import HomeWork_7.Log.LogSumMultyDiv;
import HomeWork_7.Model.ModelGen;
import HomeWork_7.Model.SumMultyDivModelGen;

import java.util.Scanner;

public class ViewSumMultyDiv implements View {
    Scanner scanner = new Scanner(System.in);
    int choice;


    @Override
    public Log startLog() {
        return new LogSumMultyDiv();
    }

    @Override
    public ModelGen getModelGen() {
        return new SumMultyDivModelGen();
    }

    public int getChoice() {
        return this.choice;
    }

    public double getValue(String nameValue){
        System.out.printf("%s", nameValue);
        return scanner.nextDouble();
    }

    public void printResult(double result){
        System.out.printf("Результат: %f\n", result);
    }

    public int choiceOperation(){
        System.out.printf("\nВыберите арифметическую операцию: \n");
        System.out.println("1 - '+' ");
        System.out.println("2 - '*' ");
        System.out.println("3 - '/' ");
        return scanner.nextInt();
    }

    public void getOperationName(int choice){
        this.choice = choice;
        if (choice == 1)
            System.out.println("Выбранная операция: сложение");
        else if (choice == 2)
            System.out.println("Выбранная операция: умножение");
        else if (choice == 3)
            System.out.println("Выбранная операция: деление");
        else {
            System.out.println("Такой операции в списке нет, повторите ввод операции");
            this.choice = choiceOperation();
        }
    }
}
