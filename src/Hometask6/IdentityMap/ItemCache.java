package Hometask6.IdentityMap;

import java.util.HashMap;

public class ItemCache {
    private HashMap<Long, Item> itemHashMap = new HashMap<>();

    public void addToCache(Item item) {
        itemHashMap.put(item.getId(), item);
    }

    public Item findInCacheById(Long id) {
        itemHashMap.containsKey(id);
        return itemHashMap.get(id);
    }
}