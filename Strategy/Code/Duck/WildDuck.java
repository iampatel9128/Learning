package Strategy.Code.Duck;
import Strategy.Code.Quack.LoudQuack;

public class WildDuck extends Duck{
    public WildDuck() {
        super(new LoudQuack());
    }
}
