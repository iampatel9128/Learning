package Strategy.Code.Duck;
import Strategy.Code.Quack.Quack;;

public abstract class Duck {
    Quack quackStrategy;
    public Duck(Quack quack) {
        this.quackStrategy = quack;
    }

    public void quack() {
        quackStrategy.quack();
    }
}