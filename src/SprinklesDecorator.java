public class SprinklesDecorator extends CakeDecorator {
    public SprinklesDecorator(ICake cake) {
        super(cake);
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }
}
