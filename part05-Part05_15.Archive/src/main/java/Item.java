public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }


    public boolean equals(Object compare){
        if(this == compare){
            return true;
        }

        if (!(compare instanceof Item)){
            return false;
        }
        
        Item compareItem = (Item) compare;
        if (this.identifier.equals(compareItem.identifier)){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return identifier + ": " + name;
    }
}
