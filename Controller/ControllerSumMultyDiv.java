package HomeWork_7.Controller;

import HomeWork_7.Log.Log;
import HomeWork_7.Log.LogSumMultyDiv;
import HomeWork_7.Model.*;
import HomeWork_7.View.View;

public class ControllerSumMultyDiv implements Controller{
    private View view;
    private Model model;
    private ModelGen modelGen;
    private Log log;

    public ControllerSumMultyDiv(View view) {
        this.view = view;
    }

    @Override
    public Log startLog() {
        return new LogSumMultyDiv();
    }

    @Override
    public ModelGen getModelGen() {
        return new SumMultyDivModelGen();
    }

    @Override
    public void buttonClick() {
        //Запускаем Логгер, соответствующий необходимым арифметическим операциям (соответствует операциям для View)
        log = startLog();
        String txt = "";
        Double a = view.enterFirstNumber();
        Double b = view.enterSecondNumber();

        //Выбираем нужную арифметическую операцию из списка (список соответствует операциям для View)
        //В консоли отобразится выбранная операция
        view.getOperationName(view.choiceOperation());
        //Выбираем нужный генератор Модели по выбранной арифметической операции (список соответствует операциям для View)
        modelGen = getModelGen();
        model = modelGen.createModel(view.getChoice());
        double result = getResultOfOperation(model, a, b);
        //Выводим результат на консоль
        view.printResult(result);
        //Сохраняем данное вычисление в файл (логируем)
        txt = log.getExpression(a, b, result, view.getChoice());
        log.writeFile(txt, "HomeWork_7\\Log\\Saving.txt");
    }

    //Метод для получения результата по выбранной Модели арифметической операции
    @Override
    public double getResultOfOperation(Model choiceModel, double x, double y){
        model = choiceModel;
        model.setX(x);
        model.setY(y);
        return model.result();
    }

}
