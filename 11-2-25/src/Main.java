public class Main {
    public static void main(String[] args) {
        Duck md = new MallardDuck();
        Duck rd = new RedheadDuck();
        Duck rbd = new RubberDuck();
        Duck dd = new DecoyDuck();

        System.out.println("Sounds of different ducks: ");
        System.out.println("\n------------------------------");
        md.display();
        md.performQuack();
        System.out.println("------------------------------");
        rd.display();
        rd.performQuack();
        System.out.println("------------------------------");
        rbd.display();
        rbd.performQuack();
        System.out.println("------------------------------");
        dd.display();
        dd.performQuack();
        System.out.println("------------------------------");

        System.out.println("\nSwimming behaviors of different ducks: ");
        System.out.println("\n------------------------------");
        md.display();
        md.performSwim();
        System.out.println("------------------------------");
        rd.display();
        rd.performSwim();
        System.out.println("------------------------------");
        rbd.display();
        rbd.performSwim();
        System.out.println("------------------------------");
        dd.display();
        dd.performSwim();
        System.out.println("------------------------------");
    }
}