package animal;

public class Test {
    public static void main(String[] args){
        Cat a = new Cat();
        a.setName("a");
        Cat b = new Cat("Bob");
        Fish c = new Fish();
        c.setName("c");
        Fish d = new Fish("DDD");
        Spider e = new Spider();

        System.out.print(a.getName()+a.legs+"\n"+b.getName()+b.legs+"\n"+c.getName()+c.legs+"\n"+d.getName()+d.legs+"\n"+e.legs);
    }
}


