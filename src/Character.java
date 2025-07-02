public abstract class Character implements Life{
    String name;
    int hp;

    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
    }

    public abstract void attack(Monster m);

}