package resturant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();

    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


public void addMenuItem(MenuItem item){
        for (MenuItem menuItem : this.menuItems) {
           if(item.equals(menuItem)) {
               System.out.println("WARNING: This item already exists");
               return;
           }
        }
        this.menuItems.add(item);

        this.lastUpdated = new Date();

}
public void removeMenuItem(MenuItem item){
        this.menuItems.remove(item);

        this.lastUpdated = new Date();
}

    @Override
    public String toString() {
        String returnString = "";
        for (MenuItem item : this.menuItems){

            returnString += item.toString() + "\n\n";

        }

        return returnString;
    }
}

