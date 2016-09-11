package lindsay.devon.InitializationLab2;

/**
 * Created by devonlindsay on 9/11/16.
 */
public class InitializationLab2 {
    public static void main(String[] args) {

        ColorfulThing coly = new ColorfulThing(ColorfulThing.Color.DARK);
        ColorfulThing lolly = new ColorfulThing(ColorfulThing.Color.LIGHT);

        ThingContainer thingy = new ThingContainer(4);

        thingy.add(coly);
        thingy.add(lolly);

        thingy.printArray();

    }


}

