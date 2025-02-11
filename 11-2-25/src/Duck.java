public abstract class Duck {
    QuackBehavior quackBehavior;

    abstract public void display();

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

}