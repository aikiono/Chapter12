public class Main {
    public static void main(String[] args) {
        Character[] c = new Character[3];
        c[0] = new Hero();
        c[0].name = "勇者";

        c[1] = new Wizard();
        c[1].name = "魔法使い";

        c[2] = new Thief();
        c[2].name = "盗賊";

        Monster[] monsters = new Monster[3];
        monsters[0] = new Slime();
        monsters[1] = new Goblin();
        monsters[2] = new Matango();

        for (Character member : c) {
            member.hp += 50; // 全員のHPを回復
        }
        for (Character member : c){
            for (Monster m : monsters){
                member.attack(m);
            }
        }

        /*Hero h = new Hero();
        h.name = "勇者";
        h.attack(new Matango());
        h.attack(new Goblin());
        h.attack(new Slime());

        //Wizard w = new Wizard();
        //Character c = new Wizard();
        Character[] c = new Character[1];
        c[0] = new Wizard();
        Wizard w = (Wizard) c[0];
        w.name = "魔法使い";
        w.attack(new Goblin());
        w.attack(new Slime());*/
    }
}