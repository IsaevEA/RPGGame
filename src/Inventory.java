import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Item> itemMap = new HashMap<>();
    private int capacity = 50;

    public void addItem(Item item){
        if (capacity > 0){
            itemMap.put(item.getName(), item);
            capacity -= item.getWeight();
        }else System.out.println("Недостаточно место");
    }
    public void removeItem(String nameItem){
        if (itemMap.containsKey(nameItem)){
            capacity += itemMap.get(nameItem).getWeight();
            itemMap.remove(nameItem);
        }
    }

    public void printAllItem(){
        System.out.println(itemMap);
    }
}
