import javax.accessibility.AccessibleTable;
import java.util.HashMap;
import java.util.Map;

public enum AttackHero {
    Sword(1),
    Shield(2);




    private static final Map<Integer, AttackHero> BY_NUMBER = new HashMap<>();

    static {
        for (AttackHero productType : values()) {
            BY_NUMBER.put(productType.number, productType);
        }
    }

    private final int number;

    AttackHero(int number) {
        this.number = number;
    }

    public static AttackHero getByNumber(int number) {
        return BY_NUMBER.get(number);
    }


}
