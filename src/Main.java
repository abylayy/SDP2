public class Main {
    public static void main(String[] args) {

        ICake basicCake = new BasicCake();
        System.out.println("Cost of Basic Cake: " + basicCake.cost());

        ICake chocolateCake = new ChocolateDecorator(basicCake);
        System.out.println("Cost of Chocolate Cake: " + chocolateCake.cost());

        ICake sprinklesCake = new SprinklesDecorator(basicCake);
        System.out.println("Cost of Cake with Sprinkles: " + sprinklesCake.cost());

        ICake inscriptionCake = new InscriptionDecorator(basicCake);
        System.out.println("Cost of Cake with inscription: " + inscriptionCake.cost());

        ICake chocolateSprinklesCake = new SprinklesDecorator(new ChocolateDecorator(basicCake));
        System.out.println("Cost of Chocolate Cake with sprinkles: " + chocolateSprinklesCake.cost());

        ICake chocolateInscriptionCake = new InscriptionDecorator(new ChocolateDecorator(basicCake));
        System.out.println("Cost of Chocolate Cake with inscription: " + chocolateInscriptionCake.cost());

    }
}