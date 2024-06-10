package HomeWork_7.View;


import java.util.Scanner;

public class ViewSumMultyDiv implements View {
    Scanner scanner = new Scanner(System.in);
    private int choice;
    
    @Override
    public int getChoice() {
        return this.choice;
    }
    
    @Override
    public double getValue(String nameValue){
        System.out.printf("%s", nameValue);
        return scanner.nextDouble();
    }
    
    @Override
    public void printResult(double result){
        System.out.printf("Результат: %f\n", result);
    }
    
    @Override
    public int choiceOperation(){
        System.out.printf("\nВыберите арифметическую операцию: \n");
        System.out.println("1 - '+' ");
        System.out.println("2 - '*' ");
        System.out.println("3 - '/' ");
        return scanner.nextInt();
    }
    
    @Override
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
