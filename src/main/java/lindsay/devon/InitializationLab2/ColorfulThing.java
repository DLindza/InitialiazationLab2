package lindsay.devon.InitializationLab2;

/**
 * Created by devonlindsay on 9/11/16.
 */
public class ColorfulThing {
    private Color color;

    public ColorfulThing (Color color) {
        this.color = color;

    }

    public Color getColor() {

        return color;

    }
// Thank you, Evan!
    @Override
    public String toString(){
        return this.getColor().name();
    }

    public enum Color {LIGHT,DARK,PURE}




}
