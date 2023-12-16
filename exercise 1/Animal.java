public abstract class Animal {
    private String name;

    Animal() {}

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void speak() {}
}