package HomeWork_7.Controller;

import HomeWork_7.Log.Log;
import HomeWork_7.Model.Model;
import HomeWork_7.Model.ModelGen;

public interface Controller {
    Log startLog();

    ModelGen getModelGen();

    void buttonClick();

    double getResultOfOperation(Model choiceModel, double x, double y);
}
