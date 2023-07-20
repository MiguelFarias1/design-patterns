package factory;

import entidade.Animal;
import entidade.Cachorro;
import entidade.Gato;

public class AnimalFactoryImpl implements AnimalFactory {
    @Override
    public Animal create(String type) {

        if("Gato".equalsIgnoreCase(type)) return new Gato();

        if("Cachorro".equalsIgnoreCase(type)) return new Cachorro();

        throw new IllegalArgumentException("Argumento inválido !");
    }
}
