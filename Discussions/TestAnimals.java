public class TestAnimals{

    public static void main(String[] args){
        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield",6);
        Dog d = new Dog("Fido",4);
        a.greet();         //(A) : Animal Pluto says Huh?
        c.greet();         //(B) : Cat Garfield says Meow!
        d.greet();         //(C): Dog Fido says WOOF!
        a=c;
        ((Cat) a).greet();  //(D): Cat Garfield says Meow!
        a.greet();         //(E): Cat Garfield says Meow!
        a = new Dog("Spot", 10);
        //d = a; // This gives a compliation error cause the static (compile time) type of a is an animal, and not every animal is a dog.
        // This bug can be fixed by casting a to be a dog.
        d = (Dog) a;
    }
}