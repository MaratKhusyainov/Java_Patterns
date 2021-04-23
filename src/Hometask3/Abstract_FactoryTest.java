package Hometask3;

import Hometask3.Abstract_factory.Abstract_factory;
import Hometask3.Abstract_factory.Ru_CarCost;
import Hometask3.Abstract_factory.USA_CarCost;
import Hometask3.Cars.Lada;

import java.util.Scanner;

public class Abstract_FactoryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        try {
            Abstract_factory factory = null;
            if (country.equals("Russia")) {
                factory = new Ru_CarCost();
            } else if (country.equals("USA")) {
                factory = new USA_CarCost();
            }
            Lada lada = factory.getLada();
            System.out.println(lada.getLadaCost());
        } catch (Exception ex) {
            System.out.println(("wrong country"));
        }
        scanner.close();
    }
}
