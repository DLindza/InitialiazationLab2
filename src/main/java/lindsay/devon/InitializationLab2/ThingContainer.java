package lindsay.devon.InitializationLab2;
import java.util.*;

import static lindsay.devon.InitializationLab2.ColorfulThing.Color.DARK;

/**
 * Created by devonlindsay on 9/11/16.
 */
public class ThingContainer {

    ColorfulThing[] colorfulThings;

    public ThingContainer(int size) {
        colorfulThings = new ColorfulThing[size];
    }


    public void add(ColorfulThing value) {
        //check if there is room in the array
        //if there is room- add value; if not Sysout "Too Full"
       for (int i = 0; i < colorfulThings.length; i++) {
            if (colorfulThings[i] == null) {
                colorfulThings[i] = value;
                return;
            }
        }
        System.out.println("Sorry - I'm full!");
       }

    public void printArray() {
        for (int i = 0; i < colorfulThings.length; i++) {
            System.out.println(colorfulThings[i]);
        }

    }

    public void pop(){
        //remove the last element of the array
        // return removed item (so it will return an item and will not be void)
    }

    public void remove() {
        //coly.remove
    }

    public void remove(Color color) {
        //coly.remove(color);
        //remove the first element that has that color (i.e.Dark) and return it
        //return null if that ThingContainer does not contain a ColorfulThing of that color
    }
}





