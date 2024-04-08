import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        //Создайте класс Phone, который содержит переменные number, model и weight.
        // ● Создайте три экземпляра этого класса.
        // ● Выведите на консоль значения их переменных.
        // ● Добавьте в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
        //   сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        // ● Вызовите эти методы для каждого из объектов.
        Phone boss = new Phone(89127452496L,"IPhone 15", 171);
        Phone father = new Phone(89275691458L,"Samsung S23", 168);
        Phone wife = new Phone(89090892399L,"Google Pixel 8", 187);
        boss.receiveCall("начальник");
        father.receiveCall("отец");
        wife.receiveCall("жена");
        System.out.println("Телефон начальника: "+boss.getNumber());
        System.out.println("Телефон отца: "+father.getNumber());
        System.out.println("Телефон жены: "+wife.getNumber());
    }
}

class Phone {
    private long number;
    private String model;
    private int weight;

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println("Номер телефона "+number+", модель "+model+", вес: "+weight+" г.");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит "+name);
    }

    public long getNumber() {
        return number;
    }
}
