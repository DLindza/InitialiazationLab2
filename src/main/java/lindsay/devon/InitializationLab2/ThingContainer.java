package lindsay.devon.InitializationLab2;

/**
 * Created by devonlindsay on 9/11/16.
 */
public class ThingContainer {

    public ColorfulThing[] colorfulThingsContainer;

    public ThingContainer(int size) {
        colorfulThingsContainer = new ColorfulThing[size];
    }

    public ThingContainer(ColorfulThing[] colorfulThingsContainer) {
        this.colorfulThingsContainer = colorfulThingsContainer;
    }


    public void add(ColorfulThing value) {
        //check if there is room in the array
        //if there is room- add value; if not Sysout "Too Full"
        for (int i = 0; i < colorfulThingsContainer.length; i++) {
            if (colorfulThingsContainer[i] == null) {
                colorfulThingsContainer[i] = value;
                return;
            }
        }
        System.out.println("Sorry - I'm full!");
    }

    public void printThings() {
        for (int i = 0; i < colorfulThingsContainer.length; i++) {
            System.out.println(colorfulThingsContainer[i]);
        }

    }

    public ColorfulThing pop() {
        int arrayLength = colorfulThingsContainer.length;
        ColorfulThing result = null;

//        for (int i = 0; i< arrayLength-1;i++ ) {
//            if(colorfulThingsContainer[i] == null && i != 0) {
//                result = colorfulThingsContainer[i-1];
//                System.out.println(result);
//                colorfulThingsContainer[i-1] = null;
//            }
//        }
//            if(result == null) {
//                result = colorfulThingsContainer[arrayLength-1];
//                System.out.println(result);
//                colorfulThingsContainer[arrayLength-1] = null;
//            }
//            return result;
//        }
//
        if (colorfulThingsContainer[arrayLength - 1] != null) {
            result = colorfulThingsContainer[arrayLength - 1];
            colorfulThingsContainer[arrayLength - 1] = null;
            return result;
        }

        for (int i = arrayLength - 1; i >= 0; i--) {

            if (colorfulThingsContainer[i] != null) {
                System.out.println(colorfulThingsContainer[i] + "has been removed from your Array");
                result = colorfulThingsContainer[i];
                System.out.println(result);
                colorfulThingsContainer[i] = null;
                System.out.println(result);
            }
        }
        System.out.println(result);
        return result;

    }

    public void shiftArray() {
        int arrayLength = colorfulThingsContainer.length;

        for(int i = 0; i < arrayLength; i++) {

            if(colorfulThingsContainer[i] == null && i != (arrayLength -1)) {
                colorfulThingsContainer[i] = colorfulThingsContainer[i+1];
                colorfulThingsContainer[i+1] = null;
            }

        }
        System.out.println("I shifted");
    }


    public ColorfulThing remove(ColorfulThing.Color color) {
//        //Re-sort Array - shiftArray
//        //Add Null to the end
        int arrayLength = colorfulThingsContainer.length;
        ColorfulThing result = null;
        for (int i = 0; i < arrayLength; i++) {
            ColorfulThing ct = colorfulThingsContainer[i];

            if (ct.getColor() == color) {
                result = colorfulThingsContainer[i];
                colorfulThingsContainer[i] = null;
                shiftArray();
                break;

            }

        }
        return result;
    }


    public ColorfulThing remove(ColorfulThing value) {
        int arrayLength = colorfulThingsContainer.length;
        ColorfulThing result = null;
        for (int i = 0; i < arrayLength; i++) {
            ColorfulThing ct = colorfulThingsContainer[i];

            if (ct == value) {
                result = colorfulThingsContainer[i];
                colorfulThingsContainer[i] = null;
                shiftArray();
                break;

            }

        }
        return result;
    }
}





