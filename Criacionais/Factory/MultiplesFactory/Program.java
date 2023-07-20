import entidade.Animal;
import factory.CachorroFactory;
import factory.GatoFactory;

public class Program {

    public static void main(String[] args) {

        Animal gato = new GatoFactory().create();

        Animal cachorro = new CachorroFactory().create();

        gato.fazerBarulho();

        cachorro.fazerBarulho();
    }
}
