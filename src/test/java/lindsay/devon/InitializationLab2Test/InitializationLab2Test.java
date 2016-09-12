package lindsay.devon.InitializationLab2Test;

import lindsay.devon.InitializationLab2.ColorfulThing;
import lindsay.devon.InitializationLab2.ThingContainer;
import org.junit.*;

/**
 * Created by devonlindsay on 9/11/16.
 */
public class InitializationLab2Test {

    @Test
    public void addTest() {
        ThingContainer newContainer = new ThingContainer(3);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);

        newContainer.add(blue);
        Assert.assertEquals("This should add blue", blue, newContainer.colorfulThingsContainer[0]);

    }


    @Test
    public void popTest() {
        ThingContainer thingContainer = new ThingContainer(3);

        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing green = new ColorfulThing(ColorfulThing.Color.GREEN);

        thingContainer.add(blue);
        thingContainer.add(red);
        thingContainer.add(green);
        ColorfulThing actual = thingContainer.pop();

        Assert.assertEquals("This should equal GREEN", green, actual);


    }

    @Test
    public void removeColorTest() {
        ThingContainer thingContainer = new ThingContainer(3);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing green = new ColorfulThing(ColorfulThing.Color.GREEN);

        thingContainer.add(blue);
        thingContainer.add(red);
        thingContainer.add(green);
        ColorfulThing actual = thingContainer.remove(ColorfulThing.Color.GREEN);

        Assert.assertEquals("This should equal green", green, actual);
    }

    @Test
    public void removeColorThingTest() {
        ThingContainer thingContainer = new ThingContainer(3);
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing red = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing green = new ColorfulThing(ColorfulThing.Color.GREEN);

        thingContainer.add(blue);
        thingContainer.add(red);
        thingContainer.add(green);
        ColorfulThing actual = thingContainer.remove(green);

        Assert.assertEquals("This should equal green", green, actual);
    }
}