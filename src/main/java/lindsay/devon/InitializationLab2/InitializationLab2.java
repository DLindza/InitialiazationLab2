package lindsay.devon.InitializationLab2;

/**
 * Created by devonlindsay on 9/11/16.
 */
public class InitializationLab2 {
    public static void main(String[] args) {

        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing yellow = new ColorfulThing(ColorfulThing.Color.YELLOW);
        ColorfulThing green = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing orange = new ColorfulThing(ColorfulThing.Color.ORANGE);

        ThingContainer thingy = new ThingContainer(5);
        ThingContainer thing1 = new ThingContainer(6);
        ThingContainer thing2 = new ThingContainer(8);

        ColorfulThing[] rainbow = new ColorfulThing[3];
        rainbow[0] = red;
        rainbow[1] = blue;
        rainbow[2] = yellow;
        ThingContainer thing3 = new ThingContainer(rainbow);

        System.out.println("Thing 3 colors");
        thing3.printThings();

        thingy.add(blue);
        thingy.add(red);
        thingy.add(yellow);
        thingy.add(green);
        thingy.add(orange);


        thingy.printThings();

       // thingy.pop();

        thingy.remove(ColorfulThing.Color.GREEN);

        thingy.printThings();

        thingy.remove(yellow);

        thingy.printThings();




    }


}

