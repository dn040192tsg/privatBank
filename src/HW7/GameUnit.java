package HW7;

public abstract class  GameUnit {

    private String name;
    private int HP;
    private int pAttack;
    private int defence;

    public GameUnit(String name, int HP, int pAttack, int defence) {
        this.name = name;
        this.HP = HP;
        this.pAttack = pAttack;
        this.defence = defence;
    }

    public void showCharacteristics (){
        System.out.println("Имя персонажа: " + getName() + ", Здоровье: " + getHP() + ", Сила аттаки: " + getpAttack()+ ", Защита: " + getDefence() );
    }


    public void openInventar(){
        System.out.println("Персонаж " + getName() + " открыл инвентарь");
    }

    public void closeInventar(){
        System.out.println("Персонаж " + getName() + " закрыл инвентарь");
    }

    public abstract void skill();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameUnit gameUnit = (GameUnit) o;

        if (HP != gameUnit.HP) return false;
        if (pAttack != gameUnit.pAttack) return false;
        if (defence != gameUnit.defence) return false;
        return name != null ? name.equals(gameUnit.name) : gameUnit.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + HP;
        result = 31 * result + pAttack;
        result = 31 * result + defence;
        return result;
    }

    @Override
    public String toString() {
        return "GameUnit{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", pAttack=" + pAttack +
                ", defence=" + defence +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getpAttack() {
        return pAttack;
    }

    public void setpAttack(int pAttack) {
        this.pAttack = pAttack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
