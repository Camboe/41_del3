package CDIO3.Fields;

public class Jail extends Field{
    private int lostValue;

    public Jail(int numPosition, int lostValue) {
        super(numPosition);
        this.lostValue = lostValue;
    }


    @Override
    public void setPosition(int numPosition) {
        super.setPosition(6);

    }


}
