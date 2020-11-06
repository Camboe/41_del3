package CDIO3;

public class ActionCard {
    private String text;
    private int valueMoney;
    Boolean bonusTurn;
    private int fieldValue;


    public ActionCard(String text, int valueMoney, Boolean bonusTurn, int fieldValue) {
        this.text = text;
        this.valueMoney = valueMoney;
        this.bonusTurn = bonusTurn;
        this.fieldValue = fieldValue;


    }
    public String getText(){
        return text;

    }
    public int getValueMoney(){
        return valueMoney;

    }
    public Boolean getBonusTurn(){
        return bonusTurn;
    }
    public int getFieldValue(){
        return fieldValue;

    }


}

