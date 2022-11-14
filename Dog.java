public class Dog {
    private String size;
    private String color;
    private String name;
    private String breed;
    private int age;

    public Dog(String size, String color, String name, String breed, int age )
        this.size = size;
        this.color = color;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
public String eat() {
    System.out.println("Time to eat!");
    return breed;
}
public String sleep(){
    System.out.println("Time to sleep you gray blob!");
    return dogObject3;
}
public String run(){
    System.out.println("Time to take " + dog2Object+ " for a run! ");
    }
public String name(){
    return this.name;
}
public static void main(String[] args){
        Dog dog1Object=new Dog("Large","Light Gray","Wilson","Bulldog","5");
        Dog dog2Object=new Dog("Large","Orange","Ollie","Beagle","6");
        Dog dog3Object=new Dog("Large","White & Orange","Bud","German Shephard","6");
    System.out.println(dog1Object.name+ " has thrown up everywhere! ");
    System.out.println(dog2Object.name+ " proceeds to eat it all up:/ ");
    System.out.println("Holy crap, that was disgusting" +dog3Object+ "says to himself. " );}
}
// may need to go over this with ya to see what i have in the wrong spot