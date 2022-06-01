package model.food;

public abstract class Item {
    String itemName;
    int preparationTimeInMins;
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName)
    {
        this.itemName=itemName;
    }
    public int getPreparationTimeInMins() {
        return preparationTimeInMins;
    }

    public void setPreparationTimeInMins(int preparationTimeInMins) {
        this.preparationTimeInMins = preparationTimeInMins;
    }
    @Override
    public String toString(){
        return "Item{" +
                "Item Name=" + itemName + '\''+
                ", preparation time in minutes = "+preparationTimeInMins+"}";
    }
}
