package case_1;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
