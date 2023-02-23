public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.eat();
        System.out.println(d.getName());
        d.play();
        d.walk();
        d.setName("Nemo");
        System.out.println(d.getName());
        c.eat();
        System.out.println(c.getName());
        c.play();
        c.walk();
        c.setName("Kit");
        System.out.println(c.getName());
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        System.out.println(p.getName());
        p.play();
        p.setName("HI");
        System.out.println(p.getName());
    }
}
