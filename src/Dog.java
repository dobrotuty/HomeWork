public class Dog {
    private String name;
    private int age;
    private boolean privivka;
    public Dog(){
        name = "Unnamed";
        age = 0;
        privivka = false;
    }
    public Dog(String n){
        name = n;
        age = 0;
        privivka = false;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
        privivka = false;
    }
    public  Dog(String n, int a, boolean p){
        name = n;
        age = a;
        privivka = p;
    }
    public void SetName(String name){
        this.name = name;
    }
    public String GetName(String name){
        return name;
    }
    public void SetAge(int age){
        this.age = age;
    }
    public int GetAge(int age){
        return age;
    }
    public void SetPrivivka(boolean privivka){
        this.privivka = true;
    }
    public boolean GetPrivivka(boolean privivka){
        return privivka;
    }
    public void DogStatus(){
        System.out.println(name+" is "+age+" years old, and have privivka status: "+privivka);
    }
}