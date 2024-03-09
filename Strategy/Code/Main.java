package Strategy.Code;

import Strategy.Code.Duck.CityDuck;
import Strategy.Code.Duck.WildDuck;

public class Main {
    public static void main(String args[]) {
        WildDuck duck = new WildDuck();
        CityDuck cityDuck = new CityDuck();
        duck.quack();
        cityDuck.quack();
    }
}
