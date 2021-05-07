package Hometask3.Abstract_factory;

import Hometask3.Cars.Ford;
import Hometask3.Cars.Lada;
import Hometask3.Cars.Lexus;
import Hometask3.Ru.Ru_FordImpl;
import Hometask3.Ru.Ru_LadaImpl;
import Hometask3.Ru.Ru_LexusImpl;

public class Ru_CarCost implements Abstract_factory{
    @Override
    public Lada getLada() {
        return new Ru_LadaImpl();
    }

    @Override
    public Ford getFord() {
        return new Ru_FordImpl();
    }

    @Override
    public Lexus getLexus() {
        return new Ru_LexusImpl();
    }
}
