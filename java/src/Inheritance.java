public class Inheritance {
    public static void main(String[] args) {
//        fish shark = new fish();
//        shark.eat();
//        dog d1 =new dog();
//        d1.eat();
//        d1.legs = 4;
}
}
//base class
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Mammals extends Animal{
    void walk () {
        System.out.println("walk");
    }
}
//class dog extends Mammals{
//    String breed;
//
//}

class fish extends Animal{
   // int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
class bird {
    void fly(){
        System.out.println("fly");
    }
}