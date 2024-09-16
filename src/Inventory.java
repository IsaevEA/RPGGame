import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Item> itemMap = new HashMap<>();
    private int capacity = 200;
    private Hero hero;

    public void addItem(Item item){
        if (capacity > 0 && hero.getGold()>item.getPrice()){
            itemMap.put(item.getName(), item);
            hero.setGold(hero.getGold() - item.getPrice());
            capacity -= item.getWeight();
        }else System.out.println("Недостаточно место");
    }
    public void removeItem(String nameItem){
        if (itemMap.containsKey(nameItem)){
            capacity += itemMap.get(nameItem).getWeight();
            hero.setGold(hero.getGold() + itemMap.get(nameItem).getPrice());
            itemMap.remove(nameItem);
        }
    }

    public void printAllItem(){
        System.out.println(itemMap);
    }
}
