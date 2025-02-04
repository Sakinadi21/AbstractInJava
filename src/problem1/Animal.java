/*Write a java program to create an abstract class Animal with an abstract method called
sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the
sound() method to make a specific sound for each animal.
*/
package problem1;
abstract class Animal {
    public abstract  void sound();

}
class Lion extends Animal{
    public void sound(){
        System.out.println("Lion roars");
    }
}
class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger growls!");
    }
}
