public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Pes", 4,true);
        Dog d2 = new Dog("Microchelick");
        Dog d3 = new Dog();
        d1.SetAge(8);
        d2.SetPrivivka(true);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.DogStatus();
        d2.DogStatus();
        d3.DogStatus();
    }
}
