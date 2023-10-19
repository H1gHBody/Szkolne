package zoo;

public class Animal {
    String spec;
    char gender;
    int age;
    boolean alive;
    long looong;
    float aFloat;
    double aDouble;
    long caloriesCounter;
    public void speak() {
        spec = "dog";
        System.out.println("My name is " + spec);
    }

    public void feed(String food) {
        System.out.println("Jedzonko " + food);
    }

    public void feed(String food, int amount) {
        System.out.println("Jedzonko " + food + "w " + amount);
    }
    public void feed(Food food){
        System.out.println("Jem sobie " + food + "która ma " + food.calories + "kalorii. ");
        caloriesCounter += food.calories;
        System.out.println("Dzisiaj zjadłem " + caloriesCounter + "kalorii.");

    }

}