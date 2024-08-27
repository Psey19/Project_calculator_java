package HomeWork_7.Log;

import java.io.FileWriter;
import java.io.IOException;

public class LogSumMultyDiv implements Log{
    @Override
    public void writeFile(String expression, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(expression + ";");
            fw.append('\n');
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String getExpression(Double x, Double y, Double result, String operation) {
        String operationChoise = "";
        if (Integer.parseInt(operation) == 1)
            operationChoise = " + ";
        if (Integer.parseInt(operation) == 2)
            operationChoise = " * ";
        if (Integer.parseInt(operation) == 3)
            operationChoise = " / ";
        return String.format("%s%s%s = %s", x, operationChoise, y, result);
    }
}
