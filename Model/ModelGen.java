package HomeWork_7.Model;

//Здесь применен паттер Фарбричный метод для создания Модели арифметической операции по выбранному номеру в списке
public interface ModelGen {
    Model createModel(int operation);
}
