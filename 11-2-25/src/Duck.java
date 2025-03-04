public abstract class Duck {
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    abstract public void display();

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setSwimBehavior(SwimBehavior sb) {
        this.swimBehavior = sb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        swimBehavior.swim();
    }
}