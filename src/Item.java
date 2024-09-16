public class Item {
    private String name;
    private int price;
    private ItemType itemType;
    private String description;
    private int using;
    private int effect;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUsing() {
        return using;
    }

    public void setUsing(int using) {
        this.using = using;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Item(String name, int price, ItemType itemType, String description, int using, int effect, int weight) {
        this.name = name;
        this.price = price;
        this.itemType = itemType;
        this.description = description;
        this.using = using;
        this.effect = effect;
        this.weight = weight;
    }
}
