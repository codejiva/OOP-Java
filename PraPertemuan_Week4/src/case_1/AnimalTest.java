package case_1;

public class AnimalTest {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Abang");
        animals[1] = new Dog("Jek");
        animals[2] = new BigDog("Blackie");

        for (Animal animal : animals) {
            animal.greets();
        }

        Dog dog = new Dog("Amel");
        dog.greets(dog);

        BigDog bigDog = new BigDog("Gilang");
        bigDog.greets(bigDog);
        bigDog.greets(dog);
    }
}
