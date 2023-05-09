public class Palawan implements Locations{
    
    int airFare = 180;

    @Override
    public void accept (Tourist tourist) {
        tourist.visit(this);
    }
}
