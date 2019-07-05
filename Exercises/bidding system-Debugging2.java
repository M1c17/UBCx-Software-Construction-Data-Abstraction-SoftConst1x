//You are designing a simple bidding system for an online text-based game
//that uses System.out.println() statements to communicate what's happening.
//Eager to quickly validate your system, you write a small simulation, the output of which is this:

//Initial price of MONKEY'S PAW is 500. Bid increment is 50!
//FRANK has bid on MONKEY'S PAW!
//DIANE has bid on MONKEY'S PAW!
//FRANK has bid on MONKEY's PAW!
//MONKEY'S PAW sold to FRANK for 0!

//Having fixed that bug, you want to add some more functionality to your auction house.
//Here, we keep a list of Items for auction in the field catalogue. Each item has a name and an id.

//Now we want to be able to update the catalogue, searching by id,
//so that we can change names of some of the items. Then we'll set the item as the currentObject
//upon which to bid.

public class AuctionHouse {
    private List<Item> catalogue;
    private Item currentObject;
    private Bid currentBid;

    public AuctionHouse() {
        catalogue = new LinkedList<>();
        currentBid = null;
        currentObject = null;
    }

    public void updateListing(int id, String newName) {
        for (Item i : catalogue) {
            if (i.equals(id)) {
                currentObject = i;
                i.setName(newName);
            }
        }
    }

    private class Item {
        String name;
        int id;
        public Item(String name, int id) { setName(name); setId(id); }
        public String getName() { return name; }
        public int getId() { return id; }
        public void setName(String name) { this.name = name; }
        public void setId(int id) { this.id = id; }
    }