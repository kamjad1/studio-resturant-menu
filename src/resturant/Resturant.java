package resturant;

public class Resturant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Chocolate Lava Cake", "Molten chocolate combines with chocolate cake is ", 7.99, "Dessert",true);

        MenuItem item2 = new MenuItem("Cheese Pizza", "thin crust topped with delicious mozzarella, Parmesan and feta cheese ", 14.99, "Entree",true);
        MenuItem item3 = new MenuItem("Ceaser Salad", "Healthy greens ", 8.99, "Salad",true);
        MenuItem item4 = new MenuItem("Ceaser Salad", "Healthy greens ", 8.99, "Salad",true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

        //System.out.println(myMenu.toString());
     //myMenu.removeMenuItem(item3);

        System.out.println(myMenu.toString());
        //        System.out.println(item1.toString());
//
//        System.out.println(item1.equals(item2));
//
//        System.out.println(item1.equals(item3));
    }
}
