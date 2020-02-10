package classes;

public class AccountHolderInfo {
    public static void main(String[] args) {
        DebitCard card1 = new DebitCard(1234567898765472L,"Nikki", 12034.34);
        DebitCard card2 = new DebitCard(1234567898765432L, "Nikki", "Visa", 1234, 120000 );

        card1.info();
        card2.info();
    }
}
