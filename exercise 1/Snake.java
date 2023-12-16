public class Snake extends Animal {
    private int hissCount;

    Snake (String name, int hissCount) {
        super(name);
        this.hissCount = hissCount;
    }

    @Override
    public void speak() {
        String hiss = "";

        for (int i = 0; i < hissCount; i++) {
            hiss += "s";
        }

        System.out.println(super.getName() + " says " + hiss + ".");
    }
}