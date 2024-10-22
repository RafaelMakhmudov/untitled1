package lesson7;

public class Person {
    // поля класса (записываются вверху класса)
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;

    // методы (то, что умеет делать этот тип)
    // Пишем метод, который будет присваивать возраст человеку

    public void setAge(int age) {
        // newAge -----> 23
        // this --- тот объект у которого вызван данный метод
        this.age = age;


    }
    // Метод будет возвращать возраст персоны
    public int getAge() {
        return this.age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
