package HW7;


public class Soldier extends GameUnit implements Runeible, Shooting {

    public Soldier(String name, int HP, int pAttack, int defence) {
        super(name, HP, pAttack, defence);
    }

    @Override
    public void skill() {
        System.out.println("Умение солдата : " + getName() + " стрелять из автомата");
    }

    @Override
    public void run() {
        System.out.println("Солдат " + getName() + " побежал");
    }

    @Override
    public void shot() {
        System.out.println("Солдат " + getName() + " выстрелил");
    }
}
