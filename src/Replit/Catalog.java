package Replit;

import java.util.ArrayList;

public class Catalog {


    public ArrayList<String> items = new ArrayList<>();
    public ArrayList<Double> prices = new ArrayList<>();
    public ArrayList<Double> monthlyPayments = new ArrayList<>();

    /**
     * This method adds all listed items to <items> arraylist
     * that is already declared above
     */
    public void loadItems() {
        //TODO

        String[] models = {"iPhone 6s", "iPhone 6s Plus", "iPhone X", "MacbookPro", "ThumbDrive", "Beats HeadPhones", "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch"};
        for (int i = 0; i < models.length; i++) {
            items.add(models[i]);
        }
      /*
        "iPhone 6s"
		"iPhone 6s Plus"
		"iPhone X"
		"MacbookPro"
		"ThumbDrive"
		"Beats HeadPhones"
		"Mouse"
		"Charger"
		"iPad"
		"Dyson Vacuum"
		"TV"
		"Apple Watch"
       */
    }

    /**
     * This method adds all listed prices to <prices> arraylist
     * that is already declared above
     */
    public void loadPrices() {
        //TODO
        double[] price = {449.0,
                549.0,
                1149.0,
                1499.99,
                39.99,
                349.99,
                79.99,
                39.99,
                429.0,
                399.0,
                2199.0,
                559.0};
        for (int i = 0; i < price.length; i++) {
            prices.add(price[i]);
        }
		/*449.0
		  549.0
		  1149.0
		  1499.99
		  39.99
		  349.99
		  79.99
		  39.99
		  429.0
		  399.0
		  2199.0
		  559.0
		 */
    }

    /**
     * This method adds all listed monthly payments to <monthlyPayments> arraylist
     * that is already declared above
     */

    public void loadMonthlyPayments() {
        //TODO
        double[] monPay = {18.71,
                22.88,
                56.16,
                79.49,
                2.68,
                15.12,
                8.98,
                4.56,
                18.31,
                16.25,
                89.49,
                21.18};
        for (int i = 0; i < monPay.length; i++) {
            monthlyPayments.add(monPay[i]);
        }
		/*
		  18.71
		  22.88
		  56.16
      79.49
      2.68
      15.12
		  8.98
		  4.56
		  18.31
		  16.25
		  89.49
		  21.18
		  */
    }

    /**
     * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
     * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
     */
    public void loadWholeCatalog() {
        //TODO
        loadMonthlyPayments();
        loadItems();
        loadPrices();
    }

    /**
     * Write a method that reads values from above ArrayLists and
     * returns a stringbuilder with all item details:
     * return format(each item in new line and delimited by '-' ):
     * iPhone 6s-449.0-18.71
     * iPhone 6s Plus-549.0-22.88
     * ..
     */

    public StringBuilder getWholeCatalog() {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        String str = "";
        for (int i = 0; i < items.size(); i++) {
            str += items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i)+ "\n";

        }
        StringBuilder sb = new StringBuilder(str);



        return sb;

    }

    /**
     * write a method that an item name and returns all details for it. If item
     * is not in the list then returns null
     * ex:
     * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68
     * getItemDetails("Charger") --> Charger-39.99-4.56
     * getItemDetails("Potato") --> null
     *
     * @param item
     * @return
     */

    public String getItemDetails(String item) {
        //LOAD WHOLE CATALOG HERE FIRST
loadWholeCatalog();
        //TODO
        String str = "";
        for (int i = 0; i <items.size() ; i++) {
            if(items.get(i).equalsIgnoreCase(item)){
               str=items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i);
            }
        }


        return str;
    }

    /**
     * write a method that accepts a price and returns a ArrayList<String> with
     * items with all detail that have less than or equal monthly payments
     * <p>
     * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
     * Charger-39.99-4.56
     * getItemsLessThanAMonthlyPrice(1.99) --> ""
     * <p>
     * //         * @param double price
     *
     * @return ArrayList<String>
     */

    public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
        //LOAD WHOLE CATALOG HERE FIRST
loadWholeCatalog();
        //TODO
        ArrayList<String> arrPrice = new ArrayList<>();
        for (int i = 0; i <monthlyPayments.size() ; i++) {
            if(monthlyPayments.get(i)<=price){
                arrPrice.add(items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i));
            }
        }

        return arrPrice;
    }

    /**
     * Method accepts a item name and updates total Price and monthly payments
     * for that item in <items>,<prices>,<monthlyPayments> arrayLists
     * When assigning monthlyPayments do =>  newPrice/12 <= to get monthly payments
     *
     * @param item     name
     * @param newPrice
     */

    public void updatePrice(String item, double newPrice) {
        //LOAD WHOLE CATALOG HERE FIRST
loadWholeCatalog();
        //TODO
        for (int i = 0; i <items.size() ; i++) {
            if(items.get(i).equalsIgnoreCase(item)){
                prices.set(i,newPrice);
                monthlyPayments.set(i,newPrice/12);
            }
        }


    }

    /**
     * Method looks for an item in the catalog and removes
     * all details for that item including item name, price, monthlypayments
     *
     * @param item
     */

    public void deleteItemFromCatalog(String item) {
        //LOAD WHOLE CATALOG HERE FIRST
loadWholeCatalog();
        //TODO
        for (int i = 0; i <items.size() ; i++) {
            if(items.get(i).equalsIgnoreCase(item)){
                items.remove(i);
                prices.remove(i);
                monthlyPayments.remove(i);
            }

        }
    }


}

