package peaksoft;

public class Rabbit  implements  Animal{

    private String paroda;
    private String color;
    private int age ;

    public Rabbit(String paroda, String color, int age) {
        this.paroda = paroda;
        this.color = color;
        this.age = age;
    }

    public Rabbit() {
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
        System.out.println("its sweet");
    }

    @Override
    public void AnimalMinus() {
        System.out.println("it cant speak");
    }
}
