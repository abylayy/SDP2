public class ChocolateDecorator extends CakeDecorator {

    public ChocolateDecorator(ICake cake) {
        super(cake);
    }

    @Override
    public int cost() {
        return super.cost() + 1000;
    }
}
