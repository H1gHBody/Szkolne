package zoo;

public class Owner {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.speak();
        dog.feed("jedzonko");
        dog.feed("jedzonko", 2);
        Food jedzonko = new Food("parówka", 5000);
        dog.feed("parówka");

    }

}