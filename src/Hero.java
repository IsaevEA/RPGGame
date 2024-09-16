public class Hero {
    private String name;
    private int gold = 2000;
    private HeroType heroType;
    private int level = 1;
    private int experience = 100;
    private int health = 1000;
    private int mana = 1200;
    private Inventory inventory;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", gold=" + gold +
                ", heroType=" + heroType +
                ", level=" + level +
                ", experience=" + experience +
                ", health=" + health +
                ", mana=" + mana +
                ", inventory=" + inventory +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Hero(String name, HeroType heroType) {
        this.name = name;
        this.heroType = heroType;

    }
}
