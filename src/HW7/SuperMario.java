package HW7;

public class SuperMario extends GameUnit implements Jumping, Swimming {

    public SuperMario(String name, int HP, int pAttack, int defence) {
        super(name, HP, pAttack, defence);
    }

    @Override
    public void skill() {
        System.out.println("Умение модельки : " + getName() + " прыгать на уток");
    }

    @Override
    public void jump() {
        System.out.println("Модель " + getName() + " пригнул");
    }

    @Override
    public void swim() {
        System.out.println("Модель " + getName() + " поплыл");
    }
}
