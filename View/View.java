package HomeWork_7.View;



public interface View {
    String getChoice();
    String getValue(String nameValue);
    void printResult(double result);
    String choiceOperation();
    void getOperationName(String choice);
    Double enterFirstNumber();
    Double enterSecondNumber();
}
