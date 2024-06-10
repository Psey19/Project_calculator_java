package HomeWork_7;

import HomeWork_7.Controller.Controller;

import HomeWork_7.Controller.ControllerSumMultyDiv;
import HomeWork_7.View.ViewSumMultyDiv;

public class Program {
    public static void main(String[] args) {
        Controller controller = new ControllerSumMultyDiv(new ViewSumMultyDiv());
        controller.buttonClick();
    }
}
