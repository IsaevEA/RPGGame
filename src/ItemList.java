import java.util.HashMap;
import java.util.Map;

public class ItemList {
    public void listItem(){

        Item item1 = new Item("Меч", 150,ItemType.Physical_Damage,"Простой меч", 25,150,5 );
        Item item2 = new Item("Меч из арихалка", 250,ItemType.Physical_Damage,"Арихалковый меч", 35,250,7 );
        Item item3 = new Item("Броня", 150,ItemType.Physical_Damage,"Простой Щит", 25,75,5 );
        Item item4 = new Item("Броня из арихалка", 200,ItemType.Physical_Damage,"Арихалковый щит", 35,150,7 );
        Item item5 = new Item("Эликсир здоровья", 75,ItemType.Physical_Damage,"Восстановление хп", 1,250,1 );
        Item item6 = new Item("Эликсир маны", 75,ItemType.Physical_Damage,"Восстановление маны", 1,200,1 );
        Item item7 = new Item("Артефакт огня", 150,ItemType.Magic_Damage,"поджигает цель", 1,150,3 );
        Item item8 = new Item("Артефакт льда", 250,ItemType.Magic_Damage,"замораживает цель на 3 удара", 1,0,3 );
        Item item9 = new Item("Жезл", 150,ItemType.Magic_Damage,"Простой жезл", 25,150,5 );
        Item item10 = new Item("Зачарованный жезл", 150,ItemType.Magic_Damage,"Зачарованный жезл", 35,250,7 );



    }
}
