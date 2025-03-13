import java.util.ArrayList;

public class Stack {
    ArrayList<Item> items;

    public Stack() {
        this.items = new ArrayList<Item>();
    }

    public void push(Item item) {
        items.add(item);
    }

    public Item pop() {
        if (items.size() == 0) {
            return null;
        }
        return items.remove(items.size() - 1);
    }

    public Item unsafePop() {
        if (items.size() == 0) {
            return null;
        }
        Item item = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return item;
    }

}
