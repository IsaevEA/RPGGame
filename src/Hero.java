public class Hero {
    private  String name;
    private int age;
    private int attackPower;
    private int xp;
    private AttackHero attackHero;

    @Override
    public String  toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", attackPower=" + attackPower +
                ", xp=" + xp +
                ", attackHero=" + attackHero +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public AttackHero getAttackHero() {
        return attackHero;
    }

    public void setAttackHero(AttackHero attackHero) {
        this.attackHero = attackHero;
    }

    public Hero(String name, int age, int attackPower, int xp, AttackHero attackHero) {
        this.name = name;
        this.age = age;
        this.attackPower = attackPower;
        this.xp = xp;
        this.attackHero = attackHero;
    }
}
