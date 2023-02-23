public class Fish extends Animal implements Pet{
    String name;
    Fish(){this("");}
    Fish(String name) {
        super(0);
        this.name= name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    void walk() {
        System.out.println("Fish don't walk! They swim.");
    }

    @Override
    void eat() {
        if (name.isEmpty()) System.out.println("Fish eats");
        else System.out.println("Fish " + name + " eats");
    }

    @Override
    public void play() {
        if (name.isEmpty()) System.out.println("Fish plays");
        else System.out.println("Fish " + name + " plays");
    }
}
