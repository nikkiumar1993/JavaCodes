package Replit;

public class LameDB {
    public static String lameDb(String db, String op, String id, String data){
        if(op.equals("add")){
           return db + "#4"+ data;
        }else if(op.equals("edit")){
            return db.replace(id, data);
        }
        return db;
    }

    public static void main(String[] args) {
        System.out.println(lameDb("1etsy#2wooden#3spoon","edit","2","aaa"));
    }
}
