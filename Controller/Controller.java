package HomeWork_7.Controller;

import HomeWork_7.Log.Log;
import HomeWork_7.Model.*;
import HomeWork_7.View.View;

public class Controller {
    private View view;
    private Model model;
    private ModelGen modelGen;

    public Controller(View view) {
        this.view = view;
    }

    public void buttonClick() {
        //Запускаем Логгер, соответствующий необходимым арифметическим операциям (соответствует операциям для View)
        Log log = view.startLog();
        String txt = "";
        System.out.println("Задайте 1-е вещественное число");
        double a = view.getValue("a: ");
        System.out.println("Задайте 2-е вещественное число");
        double b = view.getValue("b: ");

        //Выбираем нужную арифметическую операцию из списка (список соответствует операциям для View)
        int choice = view.choiceOperation();
        //В консоли отобразится выбранная операция
        view.getOperationName(choice);
        //Выбираем нужный генератор Модели по выбранной арифметической операции (список соответствует операциям для View)
        modelGen = view.getModelGen();
        model = modelGen.createModel(view.getChoice());
        double result = getResultOfOperation(model, a, b);
        //Выводим результат на консоль
        view.printResult(result);
        //Сохраняем данное вычисление в файл (логируем)
        txt = log.getExpression(a, b, result, view.getChoice());
        log.writeFile(txt, "lesson_7\\HomeWork_7\\Log\\Saving.txt");
    }
    
    //Метод для получения результата по выбранной Модели арифметической операции
    private double getResultOfOperation(Model choiceModel, double x, double y){
        model = choiceModel;
        model.setX(x);
        model.setY(y);
        return model.result();
    }

}
