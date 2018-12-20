public class Card {
    private int cardNum;
    private String suit;
    public Card(int num, String shoot) {
        cardNum = num;
        suit = shoot;
    }
    public String toString() {
        String toRet = "";
        if (cardNum <= 10) {
            return cardNum+"("+suit+")";
        }
        switch (cardNum) {
            case 11: toRet+="J"; break;
            case 12: toRet+="Q"; break;
            case 13: toRet+="K"; break;
            case 14: toRet+="A"; break;
            case 15: toRet+="2"; break;
        }
        return toRet+"("+suit+")";
    }
}
