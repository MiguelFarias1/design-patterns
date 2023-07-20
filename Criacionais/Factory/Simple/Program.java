import entidade.Animal;
import factory.AnimalFactory;
import factory.AnimalFactoryImpl;

public class Program {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactoryImpl();

        Animal animal = animalFactory.create("Cachorro");
        Animal animal2 = animalFactory.create("Gato");

        animal.fazerBarulho();

        animal2.fazerBarulho();
    }
}
