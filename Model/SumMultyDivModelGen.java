package HomeWork_7.Model;


public class SumMultyDivModelGen implements ModelGen{
    public Model createModel(int operation){
        if (operation == 1)
            return new SumModel();
        else if (operation == 2)
            return new MultiplyModel();
        else
            return new DivisionModel();
    }
}
