public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Redhead Duck");
    }
}
