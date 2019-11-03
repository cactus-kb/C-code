package package1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    public String suit;//花色
    public String rank;//点数

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
       return "(" + suit + " " + rank + ")";
    }
}
public class CardDemo {
    public static final String[] SUITS = {"♥","♠","♣","♦"};
    public static List<Card> buyPoker() {
        List<Card> poker = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            //构建四种花色
            for (int j = 2; j <= 10; j++) {
                poker.add(new Card(SUITS[i],j + ""));
            }
            poker.add(new Card(SUITS[i],"J"));
            poker.add(new Card(SUITS[i],"Q"));
            poker.add(new Card(SUITS[i],"K"));
            poker.add(new Card(SUITS[i],"A"));
        }
        return poker;
    }

    public static void main(String[] args) {
        //1.创建一副牌
        System.out.println("创建一副牌");
        List<Card> poker = buyPoker();
        //2.洗牌
        Collections.shuffle(poker);
        System.out.println(poker);
        //3.发牌(假设有三个人，每人发五张牌)
        List<List<Card>> players = new ArrayList<>();
        //表示三个玩家的三副牌
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        //把牌依次发给三个玩家
        for (int cardIndex = 0; cardIndex < 5; cardIndex++) {
            for (int playerIndex = 0; playerIndex < 3; playerIndex++) {
                //players.get(playerIndex).add(poker.remove(0));//和以下三行代码等价
                List<Card> playerCards = players.get(playerIndex);
                Card curCard = poker.remove(0);
                //虽然get一般表示读取数据，但是也可以借助get来完成修改
                playerCards.add(curCard);
            }
        }
        //4.输出玩家的手牌
        System.out.println("玩家1：");
        System.out.println(players.get(0));
        System.out.println("玩家2：");
        System.out.println(players.get(1));
        System.out.println("玩家3：");
        System.out.println(players.get(2));
    }
}
