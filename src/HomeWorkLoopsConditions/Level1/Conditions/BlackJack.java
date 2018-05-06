package HomeWorkLoopsConditions.Level1.Conditions;
/*
Посчитать, сколько очков получает игрок в Блэкджек, если он имеет карты номиналом cardA и cardB.
        Количество очков равняется номиналу большей карты, но не больше чем 21.
        Если обе карты по номиналу больше 21, то количество очков 0.
*/

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("Card A = 19 " + "Card B = 20 " + "Score: " + blackjackScore(19, 20));
        System.out.println("Card A = 22 " + "Card B = 19 " + "Score: " + blackjackScore(22, 19));
        System.out.println("Card A = 22 " + "Card B = 23 " + "Score: " + blackjackScore(22, 23));
        System.out.println("Card A = -19 " + "Card B = 20 " + "Score: " + blackjackScore(-19, 20));
        System.out.println("Card A = 22 " + "Card B = -19 " + "Score: " + blackjackScore(22, -19));
    }

    public static int blackjackScore(int cardA, int cardB) {

        if (cardA < 0 || cardB < 0) {
            throw new IllegalArgumentException("cardA and cardB must be more than zero " + cardA + " " + cardB);
        }

        int score = 0;

        if (cardA < 21 && cardB < 21) {
            if (cardA < cardB) {
                score = cardB;
            } else {
                score = cardA;
            }
        } else {
            if (cardA > 21 && cardB < 21) {
                score = cardB;
            } else {
                if (cardA < 21) {
                    score = cardA;
                }
            }
        }

        return score;
    }
}
//        Tests:
//        Card A = 19 Card B = 20 Score: 20
//        Card A = 22 Card B = 19 Score: 19
//        Card A = 22 Card B = 23 Score: 0
//        Exception in thread "main" java.lang.IllegalArgumentException: cardA and cardB must be more than zero -19 20
//        at HomeWorkLoopsConditions.Level1.Conditions.BlackJack.blackjackScore(BlackJack.java:19)
//        at HomeWorkLoopsConditions.Level1.Conditions.BlackJack.main(BlackJack.java:13)