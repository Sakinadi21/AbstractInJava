package problem4;

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}
class Lion extends Animal{
    public void eat(){
        System.out.println("Lion eats");
    }
    public void sleep(){
        System.out.println("Lion sleeps on grassland");
    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger eats meat and occasionally hunts in water");
    }
    public void sleep(){
        System.out.println("Tiger sleeps in a hidden spot");
    }
}
class Deer extends Animal{
    public void eat(){
        System.out.println("Deer grazes on grass and leaves.");
    }
    public void sleep(){
        System.out.println("Deer sleeps in open fields");
    }
}


