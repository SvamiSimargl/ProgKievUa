package lesson2.blinov_ch4_vA_10;

public class Puppy extends Dog {
    private String name;

    public Puppy(String name) {
        this.name = name;
    }

    @Override
    void sayName() {
        System.out.println("Puppy's name is " + name);
    }
    @Override
    void bark(){
        System.out.println(name + " is barking!");
    }
    @Override
    void jump(){
        System.out.println(name + " is jumping!");
    }
    @Override
    void run(){
        System.out.println(name + " is running!");
    }
    @Override
    void bite(){
        System.out.println(name + " has been bite you!");
    }
}
