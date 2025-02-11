public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck!");
    }
    
}
