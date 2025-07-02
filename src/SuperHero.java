public class SuperHero extends Hero{
    boolean flying;

    public void fly() {
        this.flying = true;
        System.out.println("飛びあがった！");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }
}