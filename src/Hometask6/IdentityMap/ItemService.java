package Hometask6.IdentityMap;

public class ItemService {
    private final ItemRepository itemRepository;
    private final ItemCache itemCache;

    public ItemService(ItemRepository itemRepository, ItemCache itemCache) {
        this.itemRepository = itemRepository;
        this.itemCache = itemCache;
    }

    public Item findById(Long id) {
        Item itemFromCache = itemCache.findInCacheById(id);

        if (itemFromCache != null) {
            return itemFromCache;
        }

        Item itemFromDb = itemRepository.findById(id);
        itemCache.addToCache(itemFromDb);
        return itemFromDb;
    }
}