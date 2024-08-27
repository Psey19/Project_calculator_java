package HomeWork_7.Model;


public class SumMultyDivModelGen implements ModelGen{
    @Override
    public Model createModel(String operation){
        if (Integer.parseInt(operation) == 1)
            return new SumModel();
        else if (Integer.parseInt(operation) == 2)
            return new MultiplyModel();
        else
            return new DivisionModel();
    }
}
