package HomeWork_7.Controller;

import HomeWork_7.Log.Log;
import HomeWork_7.Model.Model;
import HomeWork_7.Model.ModelGen;

public interface Controller {
     //Метод по выбору Логгера, который соответствует арифметическим операциям для View
    Log startLog();
    //Метод по выбору Генератора Модели, которая соответствует арифметическим операциям для View
    ModelGen getModelGen();

    void buttonClick();

    double getResultOfOperation(Model choiceModel, double x, double y);
}
