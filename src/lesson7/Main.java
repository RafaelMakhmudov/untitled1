package lesson7;

public class Main {
    public static void main(String[] args) {
        Person vasya = new Person();
        Person petya = new Person();
        // входящие параметры:
        // явные
        // неявные - vasya или petya (тот объект у которого вызван метод)
        vasya.setAge(23);
        petya.setAge(17);
        vasya.setName("Вася");

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
        System.out.println(vasya.getName());

    }
}
