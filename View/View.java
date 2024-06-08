package HomeWork_7.View;

import HomeWork_7.Log.Log;
import HomeWork_7.Model.ModelGen;

public interface View {
    //Метод по выбору Логгера, который соответствует арифметическим операциям для View
    Log startLog();
    //Метод по выбору Генератора Модели, которая соответствует арифметическим операциям для View
    ModelGen getModelGen();
    int getChoice();
    double getValue(String nameValue);
    void printResult(double result);
    int choiceOperation();
    void getOperationName(int choice);
}
