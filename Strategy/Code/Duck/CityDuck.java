package Strategy.Code.Duck;
import Strategy.Code.Quack.SoftQuack;

public class CityDuck extends Duck {
    public CityDuck() {
        super(new SoftQuack());
    }
}
