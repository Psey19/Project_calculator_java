package HomeWork_7.View;



public interface View {
    int getChoice();
    double getValue(String nameValue);
    void printResult(double result);
    int choiceOperation();
    void getOperationName(int choice);
}
