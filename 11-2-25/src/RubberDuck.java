public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }
    
}
