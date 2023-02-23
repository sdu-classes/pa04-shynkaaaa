public class Cat extends Animal implements Pet{
    String name;
    Cat() {this("");}
    Cat(String name) {
        super(4);
        this.name = name;
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
    public void play() {
        if (name.isEmpty()) System.out.println("Cat plays");
        else System.out.println("Cat " + name + " plays");
    }

    @Override
    void eat() {
        if (name.isEmpty()) System.out.println("Cat eats");
        else System.out.println("Cat " + name + " eats");
    }

}
