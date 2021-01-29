// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Cat implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: me me");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zz");
    }
}

class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();  // Create a Cat object
        myCat.animalSound();
        myCat.sleep();
    }
}