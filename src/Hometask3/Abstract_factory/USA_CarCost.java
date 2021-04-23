package Hometask3.Abstract_factory;

import Hometask3.Cars.BMW;
import Hometask3.Cars.Ford;
import Hometask3.Cars.Lexus;
import Hometask3.USA.USA_BMWImpl;
import Hometask3.USA.USA_FordImpl;
import Hometask3.USA.USA_LexusImpl;

public class USA_CarCost implements Abstract_factory {
    @Override
    public BMW getBMW() {
        return new USA_BMWImpl();
    }

    @Override
    public Ford getFord() {
        return new USA_FordImpl();
    }

    @Override
    public Lexus getLexus() {
        return new USA_LexusImpl();
    }
}