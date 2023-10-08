public abstract class CakeDecorator implements ICake {
    protected ICake cake;

    public CakeDecorator(ICake cake) {
        this.cake = cake;
    }

    @Override
    public int cost() {
        return cake.cost();
    }

}
