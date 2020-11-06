package Fields;

public class Property extends Field {
    private int propertyPrice;
    private String propertyOwner; //skal laves om til player.. TODO

    public Property(int numPosition, int propertyPrice, String propertyOwner) {
        super(numPosition);
        this.propertyPrice = propertyPrice;
        this.propertyOwner = propertyOwner;
    }


}




