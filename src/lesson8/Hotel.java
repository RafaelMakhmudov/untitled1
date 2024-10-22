package lesson8;

public class Hotel {
    private String name;
    private int stars;
    private String typeOfFood;

    public Hotel(String name, String typeOfFood, int stars) {
        this.name = name;
        this.stars = stars;
        this.typeOfFood = typeOfFood;
    }

    public Hotel() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void printHotel() {
        System.out.println("Отель: " + name + ", питание:" + typeOfFood + ", звезда:" + stars);
    }
}
