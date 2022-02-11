package peaksoft;

public class Jiraf implements Animal {
private String paroda ;
private String color;
private int age ;


    public Jiraf(String paroda, String color, int age) {
        this.paroda = paroda;
        this.color = color;
        this.age = age;
    }

    public Jiraf() {
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void AnimalPlus() {
        System.out.println("it s tall");
    }

    @Override
    public void AnimalMinus() {
        System.out.println("It cant fly");
    }
}
