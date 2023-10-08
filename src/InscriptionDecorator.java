public class InscriptionDecorator extends CakeDecorator {
    public InscriptionDecorator(ICake cake) {
        super(cake);
    }

    @Override
    public int cost() {
        return super.cost() + 500;
    }
}
