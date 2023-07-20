package factory;

import entidade.Animal;
import entidade.Cachorro;

public class CachorroFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Cachorro();
    }
}
