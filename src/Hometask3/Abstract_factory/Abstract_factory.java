package Hometask3.Abstract_factory;


import Hometask3.Cars.Ford;
import Hometask3.Cars.Lada;
import Hometask3.Cars.Lexus;

public interface Abstract_factory {

    Ford getFord();
    Lexus getLexus();
    Lada getLada();
}
