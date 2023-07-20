package factory;

import entidade.Animal;
import entidade.Gato;

public class GatoFactory implements AnimalFactory {
    @Override
    public Animal create() {

        return new Gato();
    }
}
